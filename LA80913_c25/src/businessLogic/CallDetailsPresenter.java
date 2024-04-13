package businessLogic;

import dataaccess.CallRecordFetcher;

public class CallDetailsPresenter {
	private CallRecordFetcher callRecordFetcher;

	public CallDetailsPresenter() {
		this.callRecordFetcher = new CallRecordFetcher();
	}

	public void displayCallDetails() {
		callRecordFetcher.fetchCallRecords();

	}
}
