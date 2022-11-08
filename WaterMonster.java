class WaterMonster extends Monster {

    public WaterMonster(String name, int attack) {
        super(name, attack, "water");
    }
    
    @Override
    public boolean attack(Monster opponent) {
        int damage = this.getAttack();
        if (opponent.getType().equals("fire")) {
            damage*=2;
        }
        opponent.setLife(opponent.getLife() - damage);
        return opponent.isKO();
    }
}