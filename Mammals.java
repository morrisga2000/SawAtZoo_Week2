package com.tiy.ssa.ZooTrip;

public class Mammals extends Animal {

	private boolean hasHair = true;
	private boolean mammaryGlandsPresent = true;
	private boolean placental = false;
	private boolean raisesYoung = false; 
	private boolean bipedal = false;
	private boolean hasEars = false;
	private boolean hasTail = false;
	private boolean primate = false;
	private boolean hasWings = false;
	private String nameOfMammal = null;
	public Mammals(boolean vertebrate, boolean walksUprightOnLand, boolean endothermic, boolean laysEggs, String sex,
			boolean hasHair, boolean mammaryGlandsPresent, boolean placental, boolean raisesYoung, boolean bipedal,
			boolean hasEars, boolean hasTail, boolean primate, boolean hasWings, String nameOfMammal) {
		super(vertebrate, walksUprightOnLand, endothermic, laysEggs, sex);
		this.hasHair = hasHair;
		this.mammaryGlandsPresent = mammaryGlandsPresent;
		this.placental = placental;
		this.raisesYoung = raisesYoung;
		this.bipedal = bipedal;
		this.hasEars = hasEars;
		this.hasTail = hasTail;
		this.primate = primate;
		this.hasWings = hasWings;
		this.nameOfMammal = nameOfMammal;
	}
	public String isHasHair() {
		if (hasHair)
		return ", has hair or fur";
		else
			return ", does not have hair";
	}
	public void setHasHair(boolean hasHair) {
		this.hasHair = hasHair;
	}
	public String isMammaryGlandsPresent() {
		if (mammaryGlandsPresent)
			return ". Mammary glands are present";
			else
		return ". It does not have mammary glands";
	}
	public void setMammaryGlandsPresent(boolean mammaryGlandsPresent) {
		this.mammaryGlandsPresent = mammaryGlandsPresent;
	}
	public String isPlacental() {
		if (placental)
		return ", is placental";
		else
			return ", is not placental";
	}
	
	public void setPlacental(boolean placental) {
		this.placental = placental;
	}
	public String isRaisesYoung() {
		if (raisesYoung)
			return ". It helps to raise its young.";
		else
		return ". It does not raise its young.";
	}
	public void setRaisesYoung(boolean raisesYoung) {
		this.raisesYoung = raisesYoung;
	}
	public String isBipedal() {
		if (bipedal)
		return ", is bipedal";
		else
			return ", is not bipedal";
	}
	public void setBipedal(boolean bipedal) {
		this.bipedal = bipedal;
	}
	public String isHasEars() {
		if (hasEars)
			return (", has ears");
		else
		return ", does not have ears";
	}
	public void setHasEars(boolean hasEars) {
		this.hasEars = hasEars;
	}
	public String isHasTail() {
		if (hasTail)
			return ", has a tail";
		else
		return ", it does not have a tail";
	}
	public void setHasTail(boolean hasTail) {
		this.hasTail = hasTail;
	}
	public String isPrimate() {
		if (primate)
			return ". It is a primate.";
		else
		return ". It is not a primate.";
	}
	public void setPrimate(boolean primate) {
		this.primate = primate;
	}
	public String isHasWings() {
		if (hasWings)
			return ", it has wings";
			else
		return ", it does not have wings";
	}
	public void setHasWings(boolean hasWings) {
		this.hasWings = hasWings;
	}
	public String getNameOfMammal() {
		return nameOfMammal;
	}
	public void setNameOfMammal(String nameOfMammal) {
		this.nameOfMammal = nameOfMammal;
	}
	@Override
	public String toString() {
		return "a mammal by the name of " + getNameOfMammal() + isHasHair() + isMammaryGlandsPresent() + isPlacental() + isRaisesYoung() + ", bipedal=" + bipedal + ", hasEars=" + hasEars
				+ isHasTail() + isPrimate() + isHasWings() + ", nameOfMammal="
				+ nameOfMammal + ", vertebrate=" + vertebrate + ", walksUprightOnLand=" + walksUprightOnLand
				+ ", endothermic=" + endothermic + ", laysEggs=" + laysEggs + ", sex of " + sex ;
	}
	
	
	
	
}
