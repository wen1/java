class Marathon {

	public static void main(String[] arguments) {
		String[] names = { "Elena", "Thomas", "Hamilton", "Suzie", "Phil",
				"Matt", "Alex", "Emma", "John", "James", "Jane", "Emily",
				"Daniel", "Neda", "Aaron", "Kate" };

		int[] times = { 341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412,
				393, 299, 343, 317, 265 };

		for (int i = 0; i < names.length; i++) {
			System.out.println(names[i] + ": " + times[i]);
		}
		bestPerformer(names, times);
		secondPerformer(names,times);

	}

	public static void bestPerformer(String[] names, int[] times) {
		int minTime = Integer.MAX_VALUE;
		int index = 0;
		for (int i = 0; i < names.length; i++) {
			if (minTime > times[i]) {
				minTime = times[i];
				index = i;
			}
		}

		System.out.println("the best perform is " + names[index]
				+ " with time:" + times[index]);
	}

	public static void secondPerformer(String[] names, int[] times) {
		if (names.length < 2)
			return;
		int second = 1;
		int[] firstTwoTimes = { times[0], times[1] };
		if (firstTwoTimes[0] > firstTwoTimes[1]) {
			int temp = firstTwoTimes[0];
			firstTwoTimes[0] = firstTwoTimes[1];
			firstTwoTimes[1] = temp;
			second = 0;
		}

		for (int i = 2; i < names.length; i++) {
			if (times[i] < firstTwoTimes[0]) {
				firstTwoTimes[0] = times[i];

			} else if (times[i] < firstTwoTimes[1]) {
				firstTwoTimes[1] = times[i];
				second = i;
			}
		}

		System.out.println("second " + names[second] + " " + times[second]);
	}

}