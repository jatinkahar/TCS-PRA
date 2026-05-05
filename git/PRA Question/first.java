import java.util.*;
public class first{
public static void main(String[] args){
    Scanner sc = new Scanner(System.in);

    // Step 1: Sessions input
    int n = Integer.parseInt(sc.nextLine().trim());
    List<Session> sessions = new ArrayList<>();

    for(int i = 0; i < n; i++){
        int sessionId = Integer.parseInt(sc.nextLine().trim());
        String sessionName = sc.nextLine().trim();
        int maxCapacity = Integer.parseInt(sc.nextLine().trim());

        sessions.add(new Session(sessionId, sessionName, maxCapacity));
    }

    // Step 2: Participant registration loop
    while(true){
        int participantId = Integer.parseInt(sc.nextLine().trim());
        String name = sc.nextLine().trim();
        String email = sc.nextLine().trim();

        Participant p = new Participant(participantId, name, email);

        int sid = Integer.parseInt(sc.nextLine().trim());

        Session found = null;

        for(Session s : sessions){
            if(s.sessionId == sid){
                found = s;
                break;
            }
        }

        if(found == null){
            System.out.println("Invalid Session ID.");
        } else {
            try{
                Service.registerParticipantForSession(p, found);
            } catch(Exception e){
                System.out.println(e.getMessage());
            }
        }

        int flag = Integer.parseInt(sc.nextLine().trim());
        if(flag == 0) break;
    }

    // Step 3: Display
    Service.displayAllParticipantsInSession(sessions);
}


}

class Service{
    public static void registerParticipantForSession(Participant p,Session s) throws SessionFullException, ParticipantAlreadyRegisteredException{
        
            if(s.currentCapacity>=s.maxCapacity){
                throw new SessionFullException("session is full");
            }
        
        
        
            for(Participant x:s.participants)
            {
                if(x.participantId==p.participantId){
                throw new ParticipantAlreadyRegisteredException("Already register");
                }
            }

            s.participants.add(p);
            s.currentCapacity++;
        
    }

    public static void displayAllParticipantsInSession(List<Session> sessions){
        for(Session i:sessions){
                    System.out.println("Participants in " + i.sessionName + ":");

            if(i.participants.isEmpty()){
                System.out.println("No participants in " + i.sessionName);
            }
            else{
                for(Participant p : i.participants){

                System.out.println(p.name+"("+p.email+")");
                }

            }
        }
    }
}

class Participant{
    int participantId;
    String name;
    String email;
    public Participant(int participantId,String name,String email){
        this.participantId=participantId;
        this.name=name;
        this.email=email;
    }
}
class Session{
    int sessionId;
    String sessionName;
    int maxCapacity;
    int currentCapacity;
    List<Participant> participants;
    public Session(int sessionId,String sessionName,int maxCapacity){
        this.sessionId=sessionId;
        this.sessionName=sessionName;
        this.maxCapacity=maxCapacity;
        this.currentCapacity=0;
        this.participants=new ArrayList<>();
    }
}
class SessionFullException extends Exception{
    SessionFullException(String g){

    super(g);
    }

}
class ParticipantAlreadyRegisteredException extends Exception{
    ParticipantAlreadyRegisteredException(String m){

    super(m);
    }
}
