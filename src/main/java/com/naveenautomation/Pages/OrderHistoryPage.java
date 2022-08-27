package com.naveenautomation.Pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.naveenautomation.Base.TestBase;

public class OrderHistoryPage extends TestBase {
	public OrderHistoryPage() {
		PageFactory.initElements(webDriver, this);
	}

	@FindBy(css = "#content>div:first-of-type>table>tbody>tr")
	private List<WebElement> rows;

	@FindBy(css = "#content>div:first-of-type>table>thead>tr>td")
	private List<WebElement> headers;

	public String getTextfromLastTotal(String orderID, Table_example column) {
		System.out.println(getCellFromCustomerTable(orderID, column).getText());
		return getCellFromCustomerTable(orderID, column).getText();
	}

	public String getTextfromLastDate(String orderID, Table_example column) {
		return getCellFromCustomerTable(orderID, column).getText();
	}

	public WebElement getCellFromCustomerTable(String orderID, Table_example column) {

		int columnIndex = getIndexForColumn(column);
		int orderIDColumnIndex = getIndexForColumn(Table_example.ORDER_ID);

		if (columnIndex < 0) {
			return null;
		}

		for (int i = 1; i < rows.size(); i++) {
			List<WebElement> cells = rows.get(i).findElements(By.tagName("td"));
			if (cells.size() < columnIndex || cells.size() < orderIDColumnIndex) {
				continue;
			}
			String[] devicesIds = cells.get(orderIDColumnIndex).getText().split("\n");
			for (int j = 0; j < devicesIds.length; j++) {
				if (devicesIds[j].equals(orderID)) {
					return cells.get(columnIndex);
				}
			}

		}

		System.out.println(String.format("Can't find row, which contains Company name = %s", orderID));

		return null;

	}

	private int getIndexForColumn(Table_example column) {
		for (WebElement header : headers) {
			if (column.getText().equals(header.getText())) {
				return headers.indexOf(header);

			}
		}

		return -1;
	}

	public enum Table_example {
		ORDER_ID("Order ID"), CUSTOMER("Customer"), NO_OF_PRODUCTS("No. of Products"), STATUS("Status"), TOTAL("Total"),
		DATE_ADDED("Date Added");

		private String value;

		Table_example(String value) {
			this.value = value;
		}

		public String getText() {
			return value;
		}

	}
}
