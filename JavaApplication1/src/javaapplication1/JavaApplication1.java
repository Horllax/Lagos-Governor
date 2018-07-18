import java.util.Scanner;
class Governor {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int year;
		System.out.println("Input your desired year");
		year = input.nextInt();
		if(year>=1967 && year <=1975){
			System.out.println("Gov. Mobolaji Johnson\nTook office 1967 Left office 1975\nMilitary Rule\n Military Ranks: Brigadier");
		}
		else if (year>=1976 && year <=1977){
			System.out.println("Gov. Adekunle Lawal \n Took office: July 1975. Left office: 1977 \nMilitary Rule \n Military Ranks: Commodore");
		}
		else if (year>=1977 && year <=1978){
			System.out.println("Gov. Ndubuisi Kanu \n Took office: 1977. Left office: 1978 \nMilitary Rule \n Military Ranks: Commodore");
			
		}
		else if (year>=1978 && year <= 1979){
			System.out.println("Gov. Ebitu Ukiwe \n Took office: July 1978. Left office: October 1979 \nMilitary Rule\n Military Ranks: Commodore");

		}
		else if (year>=1979 && year<= 1983){
			System.out.println("Gov. Lateef Jakande \nTook office: October 1979. Left office: December 1983 \nPolitical Party: Unity Party of Nigeria. UPN");
		}
		else if (year>=1983 && year<= 1986){
			System.out.println("Gov. Gbolahan Mudashiru \n Took office: January 1984. Left office: 1986 \nMilitary Rule \n Military Ranks: Air Commodore");
		}
		else if (year>=1986 && year<= 1988){
			System.out.println("Gov. Mike Akhigbe \n Took office: 1986. Left office: July 1988 \nMilitary Rule \n Military Ranks: Navy Captain ");
		}
		else if (year>=1988 && year<= 1992){
			System.out.println("Gov. Raji Rasaki \n Took office: July 1988. Left office: January 1992 \nMilitary Rule \n Military Ranks: Brigadier General");
		}
		else if (year>=1992 && year<= 1993){
			System.out.println("Gov. Michael Otedola \n Took office: January 1992. Left office: December 1993 \n Political party: National Republican Congress. NRC ");
		}
		else if (year>=1993 && year<= 1996){
			System.out.println("Gov. Olagunsoye Oyinlola \n Took office: 9 December 1993. Left office: 22 August 1996 \nMilitary Rule\n Military Ranks: Colonel ");
		}
		else if (year>=1996 && year<= 1999){
			System.out.println("Gov. Mohammed Buba Marwa \n Took office: 22 August 1996. Left office: 29 May 1999 \nMilitary Rule \n Military Ranks: Colonel ");
		}
		else if (year>=1999 && year<= 2007){
			System.out.println("Gov. Asiwaju Bola Ahmed Tinubu \n Took office: 29 May 1999. Left office: 29 May 2007 \n Political party: Alliance for Democracy. AD ");
		}
		else if (year>=2007 && year<= 2015){
			System.out.println("Gov. Babatunde Raji Fashola \n Took office: 29 May 2007. Left office: 29 May 2015 \n Political Party: Action Congress of Nigeria. ACN  ");
		}
		else if(year>= 2015 && year<= 2019){
			System.out.println("Gov. Akinwunmi Ambode Took office: 29 May 2015. Left office: He's the Incumbent Governor \n Political Party: All Progressive Congress. APC  ");
		}
		else{
		System.out.println("Election is not hold ");

		}

	}
}
	 