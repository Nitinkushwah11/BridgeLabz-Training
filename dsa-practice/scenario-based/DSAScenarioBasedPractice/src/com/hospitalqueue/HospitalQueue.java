package com.hospitalqueue;

class Patient
{
	String name;
	int criticality;//1 to 10
	
	Patient(String name, int criticality){
		this.name=name;
		this.criticality=criticality;
	}
}
public class HospitalQueue {
	
	public static void bubbleSort(Patient[] patients)
	{
		int n = patients.length;
		
		for(int i =0;i<n-1;i++)
		{
			for(int j =0;j<n-i-1;j++)
			{
				if(patients[j].criticality<patients[j+1].criticality) {
					//swap
					Patient temp = patients[j];
					patients[j]=patients[j+1];
					patients[j+1] = temp;
				}
			}
		}
		
		
	}
	
	public static void main(String[] args)
	{
		Patient[] list = {
				new Patient("Ravi", 3),
				new Patient("Amit",9),
				new Patient("Neha",5),
				new Patient("Sita",8)
		};
		
		bubbleSort(list);
		
		System.out.println("Patients sorted by criticality:");
		for(Patient p : list)
		{
			System.out.println(p.name+ " - " + p.criticality);
		}
	}
	
	
}
