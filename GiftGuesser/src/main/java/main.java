import java.util.*;

import Model.Present;

public class main {

	static Map<String, List<Double>> giftBoxes = new HashMap<String, List<Double>>();
	static List<Double> box1 = Arrays.asList(new Double[] { 13.5, 22.5, 36.0, 32.4 });
	static List<Double> box2 = Arrays.asList(new Double[] { 14.0, 18.5, 7.0, 11.4 });
	static List<Double> box3 = Arrays.asList(new Double[] { 16.5, 26.0, 7.5, 6.8 });

	static Map<String, List<Double>> wishList = new HashMap<String, List<Double>>();
	static List<Double> drone = Arrays.asList(new Double[] { 13.9, 9.7, 3.3, 1.5 });
	static List<Double> microsope = Arrays.asList(new Double[] { 3.9, 2.6, 1.5, 0.15 });
	static List<Double> catmug = Arrays.asList(new Double[] { 5.35, 4.57, 3.94, 1.08 });
	static List<Double> standDesk = Arrays.asList(new Double[] { 52.0, 28.5, 8.0, 80.0 });
	static List<Double> undies = Arrays.asList(new Double[] { 13.0, 8.0, 1.0, 0.0 });
	static List<Double> infinityCube = Arrays.asList(new Double[] { 1.02, 3.11, 5.51, 0.0 });
	static List<Double> keyboard = Arrays.asList(new Double[] { 17.13, 4.88, 1.59, 3.08 });
	static List<Double> deskConverter = Arrays.asList(new Double[] { 34.0, 21.5, 6.5, 27.5 });
	static List<Double> blanket = Arrays.asList(new Double[] { 0.0, 0.0, 0.0, 15.0 });
	static List<Double> Kalimba = Arrays.asList(new Double[] { 5.2, 1.3, 7.4, 1.6 });
	static List<Double> printer = Arrays.asList(new Double[] { 15.75, 16.54, 7.87, 16.98 });
	static List<Double> soap = Arrays.asList(new Double[] { 3.0, 0.75, 3.0, 0.0 });
	static List<Double> isopod = Arrays.asList(new Double[] { 21.65, 11.02, 5.91, 0.0 });

	static List<String> sGifts = new ArrayList<String>();
	static List<String> mGifts = new ArrayList<String>();
	static List<String> lGifts = new ArrayList<String>();

	static List<String> sGiftsWeight = new ArrayList<String>();
	static List<String> mGiftsWeight = new ArrayList<String>();
	static List<String> lGiftsWeight = new ArrayList<String>();

	public static void main(String[] args) {
		// Initializing lists
		giftBoxes.put("BoxL", box1);
		giftBoxes.put("BoxM", box2);
		giftBoxes.put("BoxS", box3);

		wishList.put("drone", drone);
		wishList.put("microsope", microsope);
		wishList.put("catmug", catmug);
		wishList.put("standDesk", standDesk);
		wishList.put("undies", undies);
		wishList.put("infinityCube", infinityCube);
		wishList.put("keyboard", keyboard);
		wishList.put("deskConverter", deskConverter);
		wishList.put("blanket", blanket);
		wishList.put("Kalimba", Kalimba);
		wishList.put("printer", printer);
		wishList.put("soap", soap);
		wishList.put("isopod", isopod);

		for (Map.Entry<String, List<Double>> entry : wishList.entrySet()) {
			Double volume = entry.getValue().get(0) + entry.getValue().get(1) + entry.getValue().get(2);
			Double weight = entry.getValue().get(3);
			List<Double> holder = Arrays.asList(new Double[] { volume, weight });

			wishList.put(entry.getKey(), holder);
		}
		System.out.println(wishList);

		for (Map.Entry<String, List<Double>> entry : giftBoxes.entrySet()) {
			Double volume = entry.getValue().get(0) + entry.getValue().get(1) + entry.getValue().get(2);
			Double weight = entry.getValue().get(3);
			List<Double> holder = Arrays.asList(new Double[] { volume, weight });

			giftBoxes.put(entry.getKey(), holder);
		}
		System.out.println(giftBoxes);
		System.out.println("- - - - - - - ");

		//
		//
		// cross check dimensions
		for (Map.Entry<String, List<Double>> entry : wishList.entrySet()) {
			// if wishlist item volume < box volume, add to list of possibilities
			if (entry.getValue().get(0) <= 50.0) {
				sGifts.add(entry.getKey());
			}
		}
		System.out.println("small box (vol): " + sGifts);

		for (Map.Entry<String, List<Double>> entry : wishList.entrySet()) {
			// if wishlist item volume < box volume, add to list of possibilities
			if (entry.getValue().get(0) <= 39.5) {
				mGifts.add(entry.getKey());
			}
		}
		System.out.println("medium box (vol): " + mGifts);

		for (Map.Entry<String, List<Double>> entry : wishList.entrySet()) {
			// if wishlist item volume < box volume, add to list of possibilities
			if (entry.getValue().get(0) <= 72.0) {
				lGifts.add(entry.getKey());
			}
		}
		System.out.println("large box (vol): " + lGifts);
		System.out.println("///");
		//
		//
		//
		// using list of possible dimensions, cross check weight
		for (String holder : lGifts) {
			if (wishList.get(holder).get(1) <= 32.4 && wishList.get(holder).get(1) >= 11.4) {
				lGiftsWeight.add(holder);
			}
		}
		System.out.println("Large box must contain: " + lGiftsWeight);

		for (String holder : mGifts) {
			System.out.println("weights: " + wishList.get(holder).get(1));
			if (wishList.get(holder).get(1) <= 11.4 && wishList.get(holder).get(1) >= 6.8) {
				mGiftsWeight.add(holder);
			}
		}
		System.out.println("Medium box must contain: " + mGiftsWeight);

		for (String holder : sGifts) {
			if (wishList.get(holder).get(1) <= 11.4 && wishList.get(holder).get(1) >= 6.8) {
				sGiftsWeight.add(holder);
			}
		}
		System.out.println("Small box must contain: " + sGiftsWeight);
	}

}
