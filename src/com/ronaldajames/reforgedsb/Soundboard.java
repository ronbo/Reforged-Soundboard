package com.ronaldajames.reforgedsb;

import com.ronaldajames.reforgedsb.SoundManager;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Soundboard extends Activity {
    private SoundManager mSoundManager;

	/** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        mSoundManager = new SoundManager();
        mSoundManager.initSounds(getBaseContext());
        mSoundManager.addSound(1, R.raw.sound1);
        mSoundManager.addSound(2, R.raw.sound2);
        mSoundManager.addSound(3, R.raw.sound3);
        mSoundManager.addSound(4, R.raw.sound4);
        mSoundManager.addSound(5, R.raw.sound5);
        mSoundManager.addSound(6, R.raw.sound6);
        mSoundManager.addSound(7, R.raw.sound7);
        mSoundManager.addSound(8, R.raw.sound8);
        mSoundManager.addSound(9, R.raw.sound9);
        mSoundManager.addSound(10, R.raw.sound10);
        mSoundManager.addSound(11, R.raw.sound11);
        mSoundManager.addSound(12, R.raw.sound12);
        mSoundManager.addSound(13, R.raw.sound13);
        mSoundManager.addSound(14, R.raw.sound14);
        mSoundManager.addSound(15, R.raw.sound15);
        mSoundManager.addSound(16, R.raw.sound16);
        mSoundManager.addSound(17, R.raw.sound17);
        mSoundManager.addSound(18, R.raw.sound18);
        mSoundManager.addSound(19, R.raw.sound19);
        mSoundManager.addSound(20, R.raw.sound20);
        mSoundManager.addSound(21, R.raw.sound21);
        mSoundManager.addSound(22, R.raw.sound22);
        mSoundManager.addSound(23, R.raw.sound23);
        mSoundManager.addSound(24, R.raw.sound24);
        mSoundManager.addSound(25, R.raw.sound25);
        mSoundManager.addSound(26, R.raw.sound26);
        mSoundManager.addSound(27, R.raw.sound27);
        mSoundManager.addSound(28, R.raw.sound28);
        mSoundManager.addSound(29, R.raw.sound29);
        mSoundManager.addSound(30, R.raw.sound30);

        
        Button SoundButton1 = (Button)findViewById(R.id.sound1);
        SoundButton1.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(1);
		      		
	}
});       
        Button SoundButton2 = (Button)findViewById(R.id.sound2);
        SoundButton2.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(2);
		      		
	}
});    
        Button SoundButton3 = (Button)findViewById(R.id.sound3);
        SoundButton3.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(3);
		      		
	}
});    
        Button SoundButton4 = (Button)findViewById(R.id.sound4);
        SoundButton4.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(4);
		      		
	}
});    
        Button SoundButton5 = (Button)findViewById(R.id.sound5);
        SoundButton5.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(5);
		      		
	}
});   
        Button SoundButton6 = (Button)findViewById(R.id.sound6);
        SoundButton6.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(6);
		      		
	}
});    
        Button SoundButton7 = (Button)findViewById(R.id.sound7);
        SoundButton7.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(7);
		      		
	}
});
  Button SoundButton8 = (Button)findViewById(R.id.sound8);
       SoundButton8.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(8);
		      		
	}
 });    
        Button SoundButton9 = (Button)findViewById(R.id.sound9);
        SoundButton9.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(9);
		      		
	}
});    
       Button SoundButton10 = (Button)findViewById(R.id.sound10);
       SoundButton10.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(10);
		      		
	}
 });    
        Button SoundButton11 = (Button)findViewById(R.id.sound11);
        SoundButton11.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(11);
		      		
	}
});    
        Button SoundButton12 = (Button)findViewById(R.id.sound12);
        SoundButton12.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(12);
		      		
	}
});    
       Button SoundButton13 = (Button)findViewById(R.id.sound13);
       SoundButton13.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(13);
		      		
	}
 });    
        Button SoundButton14 = (Button)findViewById(R.id.sound14);
        SoundButton14.setOnClickListener(new OnClickListener() {
	
	public void onClick(View v) {
		mSoundManager.playSound(14);
		      		
	}
});    
 
        Button SoundButton15 = (Button)findViewById(R.id.sound15);
                SoundButton15.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(15);
        		      		
        	}
        });
                Button SoundButton16 = (Button)findViewById(R.id.sound16);
                SoundButton16.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(16);
        		      		
        	}
        });    
                Button SoundButton17 = (Button)findViewById(R.id.sound17);
                SoundButton17.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(17);
        		      		
        	}
        });    
                Button SoundButton18 = (Button)findViewById(R.id.sound18);
                SoundButton18.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(18);
        		      		
        	}
        });    
                Button SoundButton19 = (Button)findViewById(R.id.sound19);
                SoundButton19.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(19);
        		      		
        	}
        });    
                Button SoundButton20 = (Button)findViewById(R.id.sound20);
                SoundButton20.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(20);
        		      		
        	}
        });    
               Button SoundButton21 = (Button)findViewById(R.id.sound21);
                SoundButton21.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(21);
        		      		
        	}
       });    
                Button SoundButton22 = (Button)findViewById(R.id.sound22);
                SoundButton22.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(22);
        		      		
        	}
        });    
                Button SoundButton23 = (Button)findViewById(R.id.sound23);
                SoundButton23.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(23);
        		      		
        	}
        });    
                Button SoundButton24 = (Button)findViewById(R.id.sound24);
                SoundButton24.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(24);
        		      		
        	}
        });    
                Button SoundButton25 = (Button)findViewById(R.id.sound25);
                SoundButton25.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(25);
        		      		
        	}
        });    
                Button SoundButton26 = (Button)findViewById(R.id.sound26);
                SoundButton26.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(26);
        		      		
        	}
        });    
                Button SoundButton27 = (Button)findViewById(R.id.sound27);
                SoundButton27.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(27);
        		      		
        	}
        });    
                Button SoundButton28 = (Button)findViewById(R.id.sound28);
                SoundButton28.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(28);
        		      		
        	}
        });    
                Button SoundButton29 = (Button)findViewById(R.id.sound29);
                SoundButton29.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(29);
        		      		
        	}
        });    
                Button SoundButton30 = (Button)findViewById(R.id.sound30);
                SoundButton30.setOnClickListener(new OnClickListener() {
        	
        	public void onClick(View v) {
        		mSoundManager.playSound(30);
        		      		
        	}
        });    
  
    }
}