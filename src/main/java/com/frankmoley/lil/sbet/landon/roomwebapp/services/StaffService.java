package com.frankmoley.lil.sbet.landon.roomwebapp.services;

import com.frankmoley.lil.sbet.landon.roomwebapp.models.Position;
import com.frankmoley.lil.sbet.landon.roomwebapp.models.StaffMember;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Service
public class StaffService {
    private static final List<StaffMember> members = new ArrayList<>();
    static {
        members.add(new StaffMember(UUID.randomUUID().toString() , "lakshan","sandaruwan", Position.FRONT_DESK));
        members.add(new StaffMember(UUID.randomUUID().toString() , "Jon","snow", Position.HOUSEKEEPING));
        members.add(new StaffMember(UUID.randomUUID().toString() , "Ned","Stark", Position.SECURITY));
        members.add(new StaffMember(UUID.randomUUID().toString() , "Rob","Stark", Position.FRONT_DESK));
    }

    public static List<StaffMember> getMembers() {
        return members;
    }
}
