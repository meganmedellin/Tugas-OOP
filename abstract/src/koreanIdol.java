public abstract class koreanIdol {
    protected String grup;
    protected String agency;

    public koreanIdol(String grup, String agency) {
        this.grup = grup;
        this.agency = agency;
    }

    public String getGrup() {
        return grup;
    }

    public String getAgency() {
        return agency;
    }

    public abstract void sapaan();
}