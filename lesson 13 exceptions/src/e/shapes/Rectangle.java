package e.shapes;

public class Rectangle {

	private int length;
	private int width;

	public int getLength() {
		return length;
	}

	public void setLength(int length) throws IlegalLengthWidthException {
		if (length >= 0) {
			this.length = length;
		} else {
			throw new IlegalLengthWidthException("length must not be negative: " + length);
		}
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) throws IlegalLengthWidthException {
		if (width >= 0) {
			this.width = width;
		} else {
			throw new IlegalLengthWidthException("width must not be negative: " + width);
		}
	}

	@Override
	public String toString() {
		return "Rectangle [length=" + length + ", width=" + width + "]";
	}

}
