public class TransferStation extends Station{
    private ArrayList <Station> TransferStationPrev;
    private ArrayList <Station> TransferStationNext;
    public ArrayList <Station> otherStations;
    
    public TransferStation(String lineColor, String name){
        super(lineColor, name);
        this.TransferStationPrev = new ArrayList<>();
        this.TransferStationNext = new ArrayList<>();
        this.otherStations = new ArrayList<>();
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

        return "TRANSFERSTATION" + name + ":" + lineColor + "line, in service:" + inService + "," + "previous station:" + prevname + "," + "next station:" + nextname; 
    }   
    
}
