package com.demo.newfeatures;

import jdk.incubator.vector.VectorSpecies;
import jdk.incubator.vector.FloatVector;

public class Vector21Demo {

	public static void main(String[] args) {
		
		float[] arr= {1f,2f,3f,5f,7f};
		float scalar=2.5f;
		
		VectorSpecies<Float> SPECIES=FloatVector.SPECIES_PREFERRED;
		System.out.println(SPECIES.length());

	}

}
