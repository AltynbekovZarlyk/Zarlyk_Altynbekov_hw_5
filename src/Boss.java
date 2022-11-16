public class Boss {
    private int bossHealth;
    private int bossDamage;
    private String protectionType;

    public int getBossHealth() {
        return this.bossHealth;
    }

    public void setBossHealth(int bossHealth) {

        this.bossHealth = bossHealth;
    }

    public int getBossDamage() {

        return this.bossDamage;
    }

    public void setBossDamage(int bossDamage) {

        this.bossDamage = bossDamage;
    }

    public String getProtectionType() {

        return this.protectionType;
    }

    public void setProtectionType(String protectionType) {

        this.protectionType = protectionType;
    }
}
