package com.example.bryanmorse.tekken7king;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

import java.util.ArrayList;

import static java.security.AccessController.getContext;

public class MainActivity extends AppCompatActivity {

    public static ArrayList<Moves> moves;
    public static ArrayList<Moves> favoriteMoves;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MainActivity.moves = new ArrayList<>();
        MainActivity.favoriteMoves = new ArrayList<>();

        initializeMoves();  //Initialize the moves list
        findFavoriteMoves();
    }

    public void openMovesTabs(View view) {
        Intent intent = new Intent(this, MovesTabs.class);
        startActivity(intent);
    }

    public void openPunishesList(View view) {
        Intent intent = new Intent(this, PunishesList.class);
        startActivity(intent);
    }

    public void openCombosList(View view) {
        //Intent intent = new Intent(this, CombosList.class);
        //startActivity(intent);
    }

    public void openPokesList(View view) {
        //Intent intent = new Intent(this, PokesList.class);
        //startActivity(intent);
    }

    public void openTestButton(View view) {
        Intent intent = new Intent(this, MovesTabs.class);
        startActivity(intent);
    }

    private void initializeMoves() {
        MainActivity.moves.add(new Moves("Rage Art", "downright", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Palm Strike to Head Jammer", "lp", "rp", "rprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Palm Strike to Jumping Power Bomb", "lp", "rp", "down", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Palm Attack to Uppercut", "lp", "rp", "lp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Palm Upper to Suplex", "lp", "rp", "lp", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Palm Upper to Jumping Power Bomb", "lp", "rp", "lp", "down", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jab Uppercut", "rp", "lp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Head Spinner", "lprp", "lp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Brutal Sting (Tailspin)", "lprp", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step", "lkrk", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Reverse Jaguar Step", "left", "lkrk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step to Hook", "lkrk", "lp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step to Elbow", "lkrk", "rp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step to Sobat", "lkrk", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step to Sobat & Press", "lkrk", "lk", "rplk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step to High Kick", "lkrk", "rk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Step to Mid Kick", "lkrk", "downright", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Moonsault Body Press (Unblockable)", "lprk", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Elbow Impact", "right", "rp", "lp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Smash Combo", "right", "rp", "down", "lp", "rp", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Front Kick", "right", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Front Kick to DDT", "right", "lk", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Rolling Sobat (Homing)", "right", "rk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Shadow Lariat", "right", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Lariat (Hold)", "right", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Exploder", "right", "lkrk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Body Check", "right", "lprk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Shoulder Tackle (Power Crush)", "right", "rplk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Elbow Sting", "downright", "lp", "rp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Double Hook Disaster (Tailspin)", "downright", "rp", "lp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Lasso Kick", "downright", "lk", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Mincer", "downright", "rk", "lk", "rk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Mincer Low", "downright", "rk", "lk", "down", "rk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Frankensteiner", "downright", "lkrk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jab Uppercut", "down", "lp", "rp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stomp", "down", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Atlas' Hammer", "down", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stagger Kick", "down", "lkrk", "rk", "rk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stagger Kicks (Counter Hit)", "down", "lkrk", "rk", "rk", "rk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stagger Kick Spinning Uppercut (During Stagger Kick)", "rp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Corporate Elbow", "down", "rplk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Brain Chop", "downleft", "rp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Crouching Low Kick", "downleft", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Low Drop Kick", "downleft", "rk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Quick Hook", "left", "lp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Quick Hook Uppercut", "left", "lp", "rp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Quick Hook Heel Kick", "left", "lp", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Chupacabra to Head Butt", "left", "rp", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Chupacabra to Toe Kick", "left", "rp", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Olympia Slam (Counter Hit)", "left", "rp", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Toll Kick", "left", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Disgraceful Kick", "left", "rk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Water Parting Chop (Homing)", "upleft", "lp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Falling Heel Kick", "upright", "lk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jumping Knee Lift", "upright", "rk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Capital Punishment", "upright", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Burning Knuckle (Hold)", "upright", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Neck Cutter Kick", "upright", "lkrk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("High Elbow Drop", "upright", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stomach Smash", "right", "right", "n", "rp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Hammer (Counter Hit)", "right", "right", "n", "rp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Lay Off", "right", "right", "n", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jaguar Hook (Tailspin, Homing)", "right", "lright", "lp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Rolling Elbow", "right", "lright", "rp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Clothesline Combo", "right", "lright", "rp", "lp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Konvict Kick", "right", "lright", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Konvict Kick to DDT (Counter Hit)", "right", "lright", "rk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Flying Cross Chop", "right", "lright", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Diving Body Press", "right", "lright", "rplk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Jumping Knee", "right", "n", "down", "ldownright", "rk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Black Bomb", "right", "n", "down", "ldownright", "lprp", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Running Exploder", "right", "right", "right", "lkrk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Round Trip Chop (Tailspin, Homing, while rising)", "rp", "rp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Snap Uppercut (while rising)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Leg Breaker (while crouching)", "downright", "lp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Body Blow (while crouching)", "downright", "rp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Victory Palm (during side step)", "rp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Deadly Boomerang (during side step)", "lkrk", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Blind Kick (back towards enemy)", "lk", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Blind Kick to Neck Breaker (during Blind Kick)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Atomic Blaster (back towards enemy)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("10 Hit Combo 1", "lp", "rp", "lp", "lp", "rp", "rk", "rk", "rk", "lp", "lk", false));
        MainActivity.moves.add(new Moves("10 Hit Combo 2", "lp", "rp", "lp", "lp", "lk", "lk", "rk", "lk", "rp", "lprp", false));
        MainActivity.moves.add(new Moves("Winding Nut", "lplk", "", "right", "lplk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Suplex", "rprk", "", "right", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Argentina Backbreaker (left side)", "lplk", "", "rprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Knee Crusher (right side)", "lplk", "", "rprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Half Boston Crash (behind)", "lplk", "", "right", "lplk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Cobra Twist (behind)", "rprk", "", "right", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stretch Buster (behind)", "left", "lright", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Knee Bast (approach)", "downright", "rplk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Figure Four Leg Lock (approach)", "downleft", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Throw Away (approach)", "left", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Throw Away Feint (approach)", "left", "lprp", "lplk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Throw Away Knockdown (approach)", "left", "lprp", "rprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Throw and Destroy (approach)", "left", "lprp", "lkrk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Turn Around (approach)", "left", "lprp", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Executioner Drop (approach)", "up", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Tombstone Piledriver (approach)", "downleft", "right", "rprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Pile Driver (approach)", "down", "downright", "lright", "lp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Double Arm Face Buster (during Pile Driver)", "lprp", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Boston Crab (during Pile Driver)", "lprp", "lk", "rk", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Muscle Buster (approach)", "down", "downleft", "left", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Giant Swing (approach)", "right", "left", "downleft", "down", "downright", "right", "lp", "", "", "", false));
        MainActivity.moves.add(new Moves("Tijuana Twister (approach)", "right", "left", "downleft", "down", "downright", "right", "rp", "", "", "", false));
        MainActivity.moves.add(new Moves("Tomahawk", "right", "right", "right", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Clothesline Press (crouching)", "downleft", "down", "downleft", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Ultimate Tackle (crouching)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Ultimate Punch (during tackle)", "rp", "lp", "rp", "lp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Cross Arm Lock (during tackle)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Arm Twist (during Cross Arm Lock)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Leg Cross Hold (during tackle)", "lkrk", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Stretch Combo (during Leg Cross Hold)", "lprp", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Iron Lariat (approach crouching enemy)", "down", "lplk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("V Driver (approach crouching enemy)", "down", "rprk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Swing Away (enemy on back by feet)", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Head Bomber", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Figure Four Leg Lock", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Shoulder Cracker (enemy on back by head)", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Turn Over (enemy on back by side)", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Half Bost Crab (enemy face down by feet", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Wing Tearer (enemy face down by head", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Camel Clutch (enemy face down left side)", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Bow & Arrow Stretch Hold (enemy face down right side)", "downleft", "lplk", "", "downleft", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Mid-Air Leg Cross Hold (approach mid-air enemy)", "lplk", "", "right", "lplk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Mid-Air Leg Screw (approach mid-air enemy)", "rprk", "", "right", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Aerial Jaguar Bomb (approach mid-air enemy)", "right", "left", "downleft", "down", "downright", "right", "lp", "", "", "", false));
        MainActivity.moves.add(new Moves("Running Jaguar Bomb (approach mid-air enemy)", "right", "right", "right", "rprk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Double Heel Hold (approach mid-air enemy)", "down", "lplk", "", "down", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Flapjack (during Double Heel Hold)", "lprp", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Giant Swing (during Double Heel Hold)", "rp", "lp", "lk", "rk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Shining Torpedo (during wall stun)", "right", "left", "downleft", "down", "downright", "right", "lp", "", "", "", false));
        MainActivity.moves.add(new Moves("Arm Whip (counter enemy right punch)", "left", "lplk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Spinning Heel Hold (counter enemy left kick)", "left", "rprk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Leg Screw (counter enemy right kick)", "left", "rprk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("STANDING HEEL HOLD COMBOS", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Standing Heel Hold (approach)", "right", "n", "down", "ldownright", "rplk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Indian Death Lock (during Standing Heel Hold)", "lprp", "lp", "lk", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("King's Bridge (during Indian Death Lock)", "lp", "lk", "rk", "lprp", "lkrk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("S.T.F. (during Standing Heel Hold)", "lp", "rp", "lk", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Scorpion Death Lock (during Standing Heel Hold)", "lprp", "lk", "lp", "lplk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("ARM BREAKER COMBO", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Arm Breaker (approach)", "right", "n", "down", "ldownright", "lprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Triple Arm Breaker (during Arm Breaker)", "lprp", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Head Jammer (during Arm Breaker)", "lprp", "rk", "rprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Struggle Combination (during Head Jammer)", "rk", "lk", "rk", "lkrk", "lprp", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Chicken Wing Face Lock (during Arm Breaker)", "rp", "lp", "lprplk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Dragon Sleeper Finish (during Chicken Wing Face Lock)", "rp", "lp", "lk", "lprprk", "lprprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Rolling Death Cradle (during Chicken Wing Face Lock)", "lplk", "lkrk", "rprk", "lprp", "lprplk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("REVERSE ARM SLAM COMBO", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Reverse Arm Slam (approach)", "downright", "lplk", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Backdrop (during Reverse Arm Slam)", "rp", "lp", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("German Suplex (during Backgrop)", "lkrk", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Power Bomb (During German Suplex)", "lp", "rp", "lkrk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Giant Swing (during Power Bomb)", "rp", "lp", "lk", "rk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Muscle Buster (during Power Bomb)", "lk", "lp", "rp", "lkrk", "all", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("REVERSE SPECIAL STRETCH BOMB COMBO", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Reverse Special Stretch Bomb (crouching enemy)", "downright", "ldownright", "lplk", "", "rprk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Reverse Special Stretch Bomb (during side step)", "rprk", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Cannonball Buster (during Reverse Special Stretch Bomb)", "rp", "rp", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Manhattan Drop (during Cannonball Buster)", "lkrk", "lprp", "lprprk", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Victory Bomb (during Manhattan Drop)", "lp", "rp", "lkrk", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Giant Swing (during Victory Bomb)", "rp", "lp", "lk", "rk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Muscle Buster (during Victory Bomb)", "lk", "lp", "rp", "lkrk", "all", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("MEXICAN MAGMA DRIVE 1", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Cobra Clutch (approach)", "lkrk", "lprk", "", "lkrk", "rplk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Flinging Half Nelson (during Cobra Clutch)", "rprk", "lprp", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Sleeper (during Cobra Clutch)", "lkrk", "lkrk", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Triple Trouble (during Sleeper)", "lp", "lp", "lprp", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Human Necktie (during Sleeper)", "lk", "rk", "lprp", "lkrk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("MEXICAN MAGMA DRIVE 2", "", "", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Cobra Clutch (approach)", "lkrk", "lprk", "", "lkrk", "rplk", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Cobra Twist (during Cobra Clutch)", "lp", "rk", "rp", "lk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Reverse DDT (during Cobra Twist)", "rp", "lp", "lplk", "", "rp", "lp", "rprk", "", "", "", false));
        MainActivity.moves.add(new Moves("Reverse Special Stretch Bomb (during Reverse DDT)", "lprp", "lp", "rp", "lprplk", "", "lprp", "lp", "rp", "lprprk", "", false));
        MainActivity.moves.add(new Moves("Samurai Rock (during Reverse DDT)", "rp", "lk", "lp", "lprp", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Backdrop (during Reverse Special Stretch Bomb)", "lkrk", "lprp", "", "", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Sol Naciente (during Backdrop)", "lprp", "rk", "lprp", "lprplk", "", "", "", "", "", "", false));
        MainActivity.moves.add(new Moves("Burning Hammer (during Backdrop)", "lprp", "lk", "rk", "lplk", "", "lprp", "lk", "rk", "rprk", "", false));
        MainActivity.moves.add(new Moves("Screwdriver (during Burning Hammer)", "rprk", "lkrk", "lplk", "lprp", "lprplk", "", "lprprk", "", "", "", false));
    }

    private void findFavoriteMoves() {
        SharedPreferences sharedPreferences = getSharedPreferences("Tekken7KingSaveData", Context.MODE_PRIVATE);
        for (int i = 0; i < moves.size(); i++) {

            //if (sharedPreferences.getString(MainActivity.moves.get(i).getName(), "").equals(MainActivity.moves.get(i).getName())) {
                Log.d("Move loaded", MainActivity.moves.get(i).getName());
            //MainActivity.moves.get(i).setCheckboxState(true);
            //}
        }
    }
}
