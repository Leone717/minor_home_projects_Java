package colorslide;

import javax.swing.*;						//oszt�lyok bek�r�se
import javax.swing.event.*;	
import java.awt.*;	

public class ColorSlide extends JFrame implements ChangeListener {	//JFrame oszt�ly �r�kl�se, v�ltoz�sfigyel� hasz.
	ColorPanel canvas = new ColorPanel();				//canvas nev� colorPanel objektum l�trehoz�a
	JSlider red = new JSlider(0, 255, 255);			//red cs�szka l�trehoz�a 0-255 sk�la 255 kezd��rt�kkel
	JSlider green = new JSlider(0, 255, 0);			//green cs�szka l�trehoz�a 0-255 sk�la 0 kezd��rt�kkel
	JSlider blue = new JSlider(0, 255, 0);			//blue cs�szka l�trehoz�sa 0-255 sk�la 0 kezd��rt�kkel
	
// Az OBJEKTUM NEV�NEK, M�RET�NEK, BEZ�R�S GOMBJ�NAK �s L�TAT�S�G�NAK BE�LL�T�SA
	public ColorSlide() {							//colorSlide objektum l�trhoz�sa
		super("ColorSlide");						//az ablak fejl�c�nek elnevez�se
		setSize(270,300);							//az ablak m�ret�nek megad�sa
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);//bez�r�s gombok hozz�ad�sa a kerethez
		setVisible(true);							//az obejtum l�that�v� t�tele
		
//A RED CS�SZKA FELOSZT�SA, R�CSOZ�SA, SZ�MOZ�SA, V�LTOZ�SFIGYEL�H�Z AD�SA
		red.setMajorTickSpacing(50);				//a cs�szk�t 50-es�vel felosztja f� vonalakra sz�moz�ssal
		red.setMinorTickSpacing(10);				//a cs�szk�t 10-�vel felosztaj, mell�kvonalakra sz�moz�s n�lk�l
		red.setPaintTicks(true);					//enged�lyezi a cs�cska ber�csoz�s�t
		red.setPaintLabels(true);					//enged�lyezi a sz�mcimk�k megjelen�t�s�t a cs�szk�n
		red.addChangeListener(this);				//a red objektum Changlelistenerhez ad�sa, hivatkozva a Colorside
													//objektumra
		
//A GREEN CS�SZKA FELOSZT�SA, R�CSOZ�SA, SZ�MOZ�SA, V�LTOZ�SFIGYEL�H�Z AD�SA	
		green.setMajorTickSpacing(50);				//green cs�szka be�ll�t�sa
		green.setMinorTickSpacing(10);
		green.setPaintTicks(true);
		green.setPaintLabels(true);
		green.addChangeListener(this);

//A BLUE CS�SZKA FELOSZT�SA, R�CSOZ�SA, SZ�MOZ�SA, V�LTOZ�SFIGYEL�H�Z AD�SA
		blue.setMajorTickSpacing(50);				//blue cs�szka be�ll�t�sa
		blue.setMinorTickSpacing(10);
		blue.setPaintTicks(true);
		blue.setPaintLabels(true);
		blue.addChangeListener(this);

//PANELEK CIMK�J�NEK �S ELRENDEZ�SKEZEL�K ELK�SZ�T�SE
		JLabel redLabel = new JLabel("Red: ");		//redLabel cimke l�trehoz�sa
		JLabel greenLabel = new JLabel("Green: ");	//greenLabel cimke l�trehoz�sa
		JLabel blueLabel = new JLabel("Blue: ");	//blueLabel cimke l�trehoz�sa
		GridLayout grid = new GridLayout(4, 1);		//Gridlayout bevezet�se, 4 sor �s 1 oszlop �rt�kben
		FlowLayout right = new FlowLayout(FlowLayout.RIGHT);//Flowlayout . mely az albak jobb oldal�ra igaz�t
		setLayout (grid);							//grid elrendez�skezel� be�ll�t�sa az objektumhoz

//RED PANEL L�TREHOZ�SA, ELRENDEZ�SKEZEL�, CIMKE �s CS�SZKA besz�r�sa, Panel objektumhoz ad�sa
		JPanel redPanel = new JPanel();				//1. redPanel l�trehoz�sa
		redPanel.setLayout(right);					//redPanel elrendez�s�nek v�ltoz�sa, right elrendez�skezel�vel
		redPanel.add(redLabel);						//redLabel cimke hozz�ad�sa a panelhez
		redPanel.add(red);							// a red JSlider cs�szka hozz�ad�sa a panelhez
		add(redPanel);								//redPanel hozz�ad�sa a ColorSlide objektumhoz
		
//GREEN PANEL L�TREHOZ�SA, ELRENDEZ�SKEZEL�, CIMKE �s CS�SZKA besz�r�sa, Panel objektumhoz ad�sa
		JPanel greenPanel = new JPanel();			//2. redPanel l�trehoz�sa
		greenPanel.setLayout(right);				//greenPanel elrendez�s�nek v�ltoz�sa, right elrendez�skezel�vel
		greenPanel.add(greenLabel);					//greenLabel cimke hozz�ad�sa a panelhez
		greenPanel.add(green);						//a green JSlider cs�szka hozz�ad�sa a panelhez
		add(greenPanel);							//greenPanel hozz�ad�sa a ColorSlide objektumhoz
		
//BLUE PANEL L�TREHOZ�SA, ELRENDEZ�SKEZEL�, CIMKE �s CS�SZKA besz�r�sa, Panel objektumhoz ad�sa
		JPanel bluePanel = new JPanel();			//3. redPanel l�trehoz�sa
		bluePanel.setLayout(right);					//bluePanel elrendez�s�nek v�ltoz�sa, right elrendez�skezel�vel
		bluePanel.add(blueLabel);					//blueLabel cimke hozz�ad�sa a panelhez
		bluePanel.add(blue);						// a blue JSlider cs�szka hozz�ad�sa a panelhez
		add(bluePanel);								//bluePanel hozz�ad�sa a ColorSlide objektumhoz
		add(canvas);								//a canvas ColorPanel objektum hozz�ad�da az objektumhoz(4.sor)
		
		setVisible(true);							//az objektum l�that�v� t�tele
	}
	
//stateChanged fgv l�trehoz�a mely a cs�szkav�ltoz�st figyeli �s az evt obejtumhoz adja
	public void stateChanged(ChangeEvent evt) {		
		JSlider source = (JSlider) evt.getSource();	//source cs�szka l�etrehoz�a, mely cs�szka evt forr�s�t k�ri be
		if (source.getValueIsAdjusting() != true) {	//ha a source cs�szka elh�z�dik 
			Color current = new Color(red.getValue(),//current Color objektum �j sz�m mely a red sz�n�t k�ri be
					green.getValue(),				//green sz�n�rt�k�t k�ri be
					blue.getValue());				//blue sz�n�rt�k�t k�ri be
			canvas.changeColor(current);			//canvas Colorpanel changeColor f�ggv�nye, mely megv�ltoztatja
													//current �rt�k�t
			canvas.repaint();						//canvas repaint() f�ggv�nye mely �tfesti a canvas �rt�k�t
		}
	}
//SZEG�LY �s BEH�Z�S BE�LL�T�SA
	public Insets getInsets() {						//getInset fgv l�trehoz�sa, szeg�lyez�sre
		Insets border = new Insets(45, 10, 10, 45);	//border
		//1. fentr�l 45 k�ppont 2.balr�l 3. lentr�l 4. jobbr�l
		
		return border;
	}
	
	public static void main(String[] arguments) {	//main v�grehajt� fgv l�trehoz�sa
	ColorSlide cs = new ColorSlide();				//cs ColosSldie objektum l�trahoz�sa
	}
}

class ColorPanel extends JPanel {					//Colorpanel oszt�lyba �r�kl�se a JPanelnek
	Color background;								//background Color objektum bevezet�se
	
	ColorPanel()  {									
		 background = Color.red;					//background bevezet�se
	}
	public void paintComponent(Graphics comp)  {	//Grapcsihg comp bevezet�se
		Graphics2D comp2D = (Graphics2D)comp;		//comp2D 
		comp2D.setColor(background);				//background sz�n�nek a be�ll�t�sa
		comp2D.fillRect(0, 0, getSize().width, getSize().height);//a kit�lti a sz�ksg�es panelt
	}
	
	void changeColor(Color newBackground) {
		background = newBackground;
	}	
}
