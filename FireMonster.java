class FireMonster extends Monster {

    public FireMonster(String name, int attack) {
        super(name, attack, "fire");
    }
    
    @Override
    public boolean attack(Monster opponent) {
        int damage = this.getAttack();
        if (opponent.getType().equals("air")) {
            damage*=2;
        }
        opponent.setLife(opponent.getLife() - damage);
        return opponent.isKO();
    }   
}