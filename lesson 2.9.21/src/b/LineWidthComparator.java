package b;

import java.util.Comparator;

/**
 * this class is used to compare lines other than their natural order (line
 * length). here we want to compare by line width. to determine orders other
 * than natural we implement Comparator interface
 */
public class LineWidthComparator implements Comparator<Line> {

	@Override
	public int compare(Line line1, Line line2) {
		if (line1.getWidth() < line2.getWidth()) {
			return -1;
		} else if (line1.getWidth() > line2.getWidth()) {
			return 1;
		} else {
			return 0;
		}
	}

}
