package Model;

import java.util.List;

public class Present {
	private Double length;
	private Double width;
	private Double height;
	private Double weight;
	
	public static Present presenter (Double l, Double w, Double h, Double weight ) {
		Present holder = null;
		holder.height = h;
		holder.length = l;
		holder.width = w;
		holder.weight = weight;
		return holder;
	}

	public Double getLength() {
		return length;
	}

	public void setLength(Double length) {
		this.length = length;
	}

	public Double getWidth() {
		return width;
	}

	public void setWidth(Double width) {
		this.width = width;
	}

	public Double getHeight() {
		return height;
	}

	public void setHeight(Double height) {
		this.height = height;
	}

	public Double getWeight() {
		return weight;
	}

	public void setWeight(Double weight) {
		this.weight = weight;
	}
}
