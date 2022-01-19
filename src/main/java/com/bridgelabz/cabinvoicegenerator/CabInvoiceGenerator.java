package com.bridgelabz.cabinvoicegenerator;

public class CabInvoiceGenerator {
	public final int COST_PER_KILOMETER = 10;
	private final int COST_PER_MINUTE = 1;

	public int calculateFare(int distance, int time) {
		int totalFare = distance * COST_PER_KILOMETER + time * COST_PER_MINUTE;
		if (totalFare < 5)
			totalFare = 5;
		return totalFare;
	}
	public int calculateTotalAggregateFare(Ride[] rides) {
        int totalAggregateFare = 0;
        for(Ride ride : rides)
            totalAggregateFare += calculateFare(ride.distance , ride.time);
        return totalAggregateFare;
    }
}
