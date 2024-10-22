public class Station{
    protected String name;
    protected String lineColor;
    protected Station prev;
    protected Station next; 
    protected boolean inService;

    public Station(String lineColor, String name){
        this.lineColor = lineColor;
        this.name = name;
        this.prev = null;
        this.next = null;
        this.inService = true; 
    }

    public void addPrev(Station prev){
        this.prev = prev;
        if(prev != null){
            prev.next = this;
        }
    }

    public void addNext(Station next){
        this.next = next;
        if(next != null){
            next.prev = this;
        }
    }

    public void inService(){
        this.inService = true;
    }

    public void switchAvailable(){
        this.inService = !this.inService; 
    }

    public void connect(Station station){
        this.next = station; 
        if(station != null){
            station.prev = this;
        }
    }

    public int tripLength(Station dest){ 
        if(this == dest){
            return 0;
        } 

        if(this.next != null){
            int numStopsLeft = this.next.tripLength(dest);

        if(numStopsLeft != -1){
            return numStopsLeft + 1;
        }                                                                                                 

    }

    return -1;
}

    
    public String toString(){
        String prevname;
        String nextname; 

        if(prev == null){
            prevname = "none";
        }
        else{
            prevname = prev.name;
        }

        if(next == null){
            nextname = "none";
        }
        else{
            nextname = next.name;
        }

        return "STATION" + name + ":" + lineColor + "line, in service:" + inService + "," + "previous station:" + prevname + "," + "next station:" + nextname; 
    }
}
