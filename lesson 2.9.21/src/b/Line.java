package b;

import java.util.ArrayList;
import java.util.List;

/**
 * lines natural order is determined by the line length. this means that in
 * sorting short lines are before long lines. natural order is defined by
 * implementing the Comparable interface.
 */
public class Line implements Comparable<Line> {

	private int length;
	private int width;

	public Line(int length, int width) {
		super();
		this.length = length;
		this.width = width;
	}

	public void print() {
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < length; j++) {
				System.out.print("-");
			}
			System.out.println();
		}
		System.out.println();
		System.out.println();
	}

	public static void main(String[] args) {
		List<Line> lines = new ArrayList<>();
		lines.add(new Line(10, 2));
		lines.add(new Line(25, 1));
		lines.add(new Line(3, 3));
		lines.add(new Line(12, 4));

//		lines.sort(null); // sort by natural order
		lines.sort(new LineWidthComparator()); // sort by other order (width)

		for (Line line : lines) {
			line.print();
		}
	}

	@Override
	public int compareTo(Line other) {

		if (this.length < other.length) {
			// if we are here than this line is shorter and comes before other line
			return -1;
		} else if (this.length > other.length) {
			// if we are here than this line is longer and comes after other line
			return 1;
		} else {
			// if we are here than this line is same as other line
			return 0;
		}
	}

	public int getLength() {
		return length;
	}

	public int getWidth() {
		return width;
	}

}
