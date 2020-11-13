package starter;

public class Enemy {

	private EnemyType enemyName;
	private int dx, dy;
	private Item itemDrop;
	
	int enemyHP;
	int damage;
	int attackRadius;
	boolean isVertical;
	
	public Enemy(EnemyType enemyName, int x, int y,int enemyHP, int damage, boolean isVertical) {
		this.enemyName = enemyName;
		dx = x;
		dy = y;
		this.enemyHP = enemyHP;
		this.damage = damage;
		this.isVertical = isVertical;
	}
	
	public String toString() {
		return enemyName.toString();
	}

	//Getters
	
	public EnemyType getEnemyName() {
		return enemyName;
	}

	public int getEnemyXPosition() {
		return dx;
	}
	
	public int getEnemyYPosition() {
		return dy;
	}

	public int getEnemyHp() {
		return enemyHP;
	}

	public int getDamage() {
		return damage;
	}
	
	public boolean getIsVertical() {
		return isVertical;
	}

	//Setters
	
	public void setEnemyName(EnemyType enemyName) {
		this.enemyName = enemyName;
	}

	public void setEnemeyXPosition(int x) {
		dx = x;
	}
	
	public void setEnemeyYPosition(int y) {
		dy = y;
	}

	public void setEnemyHp(int enemyHP) {
		this.enemyHP = enemyHP;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}
	
	public void setIsVertical(boolean isVertical) {
		this.isVertical = isVertical;
	}
	
	//Check if enemy is dead
	public boolean isdead(int enemyHP) {
		if (enemyHP <= 0) {
			return true; 
		}
		return false;
	}
	
	/*checks if enemy is a chest
	 * if enemy is a chest then drop item
	 */
	public Item dropItem(EnemyType enemyName) {
		if (enemyName.toString() == "chest") {
			return itemDrop;
		}
		return null;
	}
	
	//text based test
	public static void main(String[] args) {
		
		Enemy enemy1 = new Enemy(EnemyType.GOBLIN, 5, 5, 50, 15, true);
		Enemy enemy2 = new Enemy(EnemyType.SLIME, 7, 4, 20, 5, false);
		Enemy enemy3 = new Enemy(EnemyType.GOBLIN, 1, 7, 200, 25, true);
		
		System.out.println("The enemy spawned is: " + enemy1.toString() + " Their X postion is: (" + enemy1.getEnemyXPosition() + ") Their Y Position is: (" + enemy1.getEnemyYPosition() + ") Its HP is: " + enemy1.getEnemyHp() + " It hits for: " + enemy1.getDamage() + " Enemy is moving vertically: " + enemy1.getIsVertical());
		System.out.println("The enemy spawned is: " + enemy2.toString() + " Their X postion is: (" + enemy2.getEnemyXPosition() + ") Their Y Position is: (" + enemy2.getEnemyYPosition() + ") Its HP is: " + enemy2.getEnemyHp() + " It hits for: " + enemy2.getDamage() + " Enemy is moving vertically: " + enemy2.getIsVertical());
		System.out.println("The enemy spawned is: " + enemy3.toString() + " Their X postion is: (" + enemy3.getEnemyXPosition() + ") Their Y Position is: (" + enemy3.getEnemyYPosition() + ") Its HP is: " + enemy3.getEnemyHp() + " It hits for: " + enemy3.getDamage() + " Enemy is moving vertically: " + enemy3.getIsVertical());
	}
}
