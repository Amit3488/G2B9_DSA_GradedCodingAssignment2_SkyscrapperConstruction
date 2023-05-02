package com.gl.javafsd.dsa.skyscrapperconstruction;

import java.util.Scanner;
import java.util.*;

public class SkyscrapperConstruction {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("Enter the total number of floors in the building:");
			int n = sc.nextInt();
			int[] floors = new int[n + 1];

			for (int i = 1; i < n + 1; i++) {
				System.out.println("Enter the floor size given on day:" + i);
				floors[i] = sc.nextInt();
			}
			Stack<Integer> assemblyStack = new Stack<>();
			for (int i = 1; i < n + 1; i++) {
				int currentFloor = floors[i];
				while (!assemblyStack.isEmpty() && currentFloor < assemblyStack.peek()) {
					System.out.print(assemblyStack.pop() + " ");
				}
				assemblyStack.push(currentFloor);
				System.out.println();
			}
			while (!assemblyStack.isEmpty()) {
				System.out.print(assemblyStack.pop() + " ");
			}
		}
	}
}