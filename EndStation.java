public class EndStation extends Station{

    public EndStation(String lineColor, String name){
        super(lineColor, name);
    }

    public void makeEnd(){
        if(this.prev == null){
            this.prev = this.next;
        }

        if(this.next == null){
            this.next = this.prev;
        } 
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

        return "ENDSTATION" + name + ":" + lineColor + "line, in service:" + inService + "," + "previous station:" + prevname + "," + "next station:" + nextname; 
    }   
}
