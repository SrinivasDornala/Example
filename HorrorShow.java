package com.d;

interface Monster {
	  void menace();
	}

	interface DangerousMonster extends Monster {
	  void destroy();
	}

	interface Lethal {
	  void kill();
	}

	class DragonZilla implements DangerousMonster {
	  public void menace() {
		  System.out.println("D menace");
	  }

	  public void destroy() {
		  System.out.println("D destroy");
	  }
	}

	interface Vampire extends DangerousMonster, Lethal {
	  void drinkBlood();
	}

	class VeryBadVampire implements Vampire {
	  public void menace() {
		  System.out.println("v menace");
	  }

	  public void destroy() {
		  System.out.println("v destroy");
	  }

	  public void kill() {
		  System.out.println("v kill");
	  }

	  public void drinkBlood() {
		  System.out.println("v drink blood");
	  }
	}

	public class HorrorShow  {
	  static void u(Monster b) {
	    b.menace();
	    System.out.println("horror monster show");
	  }

	  static void v(DangerousMonster d) {
	    d.menace();
	    System.out.println("Dangerous monsster horror show");
	    d.destroy();
	  }

	  static void w(Lethal l) {
	    l.kill();
	    System.out.println("lethal horror show");
	  }

	  public static void main(String[] args) {
	    DangerousMonster barney = new DragonZilla();
	    u(barney);
	    v(barney);
	    Vampire vlad = new VeryBadVampire();
	    u(vlad);
	    v(vlad);
	    w(vlad);
	    System.out.println("hjd");
	  }
	} 
