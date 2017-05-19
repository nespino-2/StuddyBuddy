import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;

public class StudyBuddyController implements Initializable {

  @FXML
  private Button validateBtn;
  
  @FXML
  private Button srchBtn;
  
  @FXML
  private TextField userEmail;
  
  @FXML
  private Label verifiedLbl;

  @FXML
  private TextField userCrseOne;

  @FXML
  private TextField userCrseTwo;
  
  @FXML
  private TextField userCrseThree;

  @FXML
  private TextField userCrseFour;
  
  @FXML
  private TextField userCrseFive;
  
  @FXML
  private TextField userCrseSix;

  @FXML
  private Label OneStdntA;

  @FXML
  private Label TwoStdntA;
  
  @FXML
  private Label ThreeStdntA;
  
  @FXML
  private Label FourStdntA;
  
  @FXML
  private Label FiveStdntA;
  
  @FXML
  private Label SixStdntA;
  
  @FXML
  private Label OneStdntB;

  @FXML
  private Label TwoStdntB;
  
  @FXML
  private Label ThreeStdntB;
  
  @FXML
  private Label FourStdntB;
  
  @FXML
  private Label FiveStdntB;
  
  @FXML
  private Label SixStdntB;
  
  @FXML
  private Label OneStdntC;

  @FXML
  private Label TwoStdntC;
  
  @FXML
  private Label ThreeStdntC;
  
  @FXML
  private Label FourStdntC;
  
  @FXML
  private Label FiveStdntC;
  
  @FXML
  private Label SixStdntC;
  
  @FXML
  private ImageView iconOne;
  
  @FXML
  private ImageView iconTwo;
  
  @FXML
  private ImageView iconThree;
  
  @FXML
  private ImageView iconFour;

  @FXML
  private ImageView iconFive;
  
  @FXML
  private ImageView iconSix;
  
  boolean checkENGLCourseOne;
  boolean checkENGLCourseTwo;
  boolean checkENGLCourseThree;
  boolean checkENGLCourseFour;
  boolean checkENGLCourseFive;
  boolean checkENGLCourseSix;
  
  boolean checkHUMCourseOne;
  boolean checkHUMCourseTwo;
  boolean checkHUMCourseThree;
  boolean checkHUMCourseFour;
  boolean checkHUMCourseFive;
  boolean checkHUMCourseSix;

  boolean checkCHEMCourseOne;
  boolean checkCHEMCourseTwo;
  boolean checkCHEMCourseThree;
  boolean checkCHEMCourseFour;
  boolean checkCHEMCourseFive;
  boolean checkCHEMCourseSix;
  
  boolean checkPHYSCourseOne;
  boolean checkPHYSCourseTwo;
  boolean checkPHYSCourseThree;
  boolean checkPHYSCourseFour;
  boolean checkPHYSCourseFive;
  boolean checkPHYSCourseSix;
  
  boolean checkCSCICourseOne;
  boolean checkCSCICourseTwo;
  boolean checkCSCICourseThree;
  boolean checkCSCICourseFour;
  boolean checkCSCICourseFive;
  boolean checkCSCICourseSix;
  
  boolean checkMATHCourseOne;
  boolean checkMATHCourseTwo;
  boolean checkMATHCourseThree;
  boolean checkMATHCourseFour;
  boolean checkMATHCourseFive;
  boolean checkMATHCourseSix;
  

  @FXML
  private void handleButtonAction(ActionEvent e) {
    // Create object to access the Model
    
    if (e.getSource() == validateBtn)
    {
      if (userEmail.getText().endsWith(".edu"))
      {
         verifiedLbl.setText("Verified");
      }
      else
      {
         verifiedLbl.setText("must end in edu ");
         userEmail.setText("ENTER VALID EMAIL");
      }
    }
}
  
  @FXML
  private void handleScndButtonAction(ActionEvent ae){
  
   if (ae.getSource() == srchBtn)
   {
      if (verifiedLbl.getText().contains("Verified"))
      {
        StudyBuddyModel similarCrses = new StudyBuddyModel();
      
      // Student A courses
      
         OneStdntA.setText(similarCrses.StudentACourseOne());
         TwoStdntA.setText(similarCrses.StudentACourseTwo());
         ThreeStdntA.setText(similarCrses.StudentACourseThree());
         FourStdntA.setText(similarCrses.StudentACourseFour());
         FiveStdntA.setText(similarCrses.StudentACourseFive());
         SixStdntA.setText(similarCrses.StudentACourseSix());
         
       // Student B courses
       
         OneStdntB.setText(similarCrses.StudentBCourseOne());
         TwoStdntB.setText(similarCrses.StudentBCourseTwo());
         ThreeStdntB.setText(similarCrses.StudentBCourseThree());
         FourStdntB.setText(similarCrses.StudentBCourseFour());
         FiveStdntB.setText(similarCrses.StudentBCourseFive());
         SixStdntB.setText(similarCrses.StudentBCourseSix());
         
      // Student C courses
         
         OneStdntC.setText(similarCrses.StudentCCourseOne());
         TwoStdntC.setText(similarCrses.StudentCCourseTwo());
         ThreeStdntC.setText(similarCrses.StudentCCourseThree());
         FourStdntC.setText(similarCrses.StudentCCourseFour());
         FiveStdntC.setText(similarCrses.StudentCCourseFive());
         SixStdntC.setText(similarCrses.StudentCCourseSix());
         
      /* 
       * Intstantiate boolean variable, returns true if user inputs 
       * a possible course for CourseOne. False if no match is found.
       */  
         
         String oneU = userCrseOne.getText();
         checkCSCICourseOne = oneU.startsWith("CSCI") && oneU.endsWith("66") || oneU.endsWith("26") ||
                                   oneU.endsWith("13");
         checkMATHCourseOne = oneU.startsWith("MATH") && oneU.endsWith("31") || oneU.endsWith("32");
         checkPHYSCourseOne = oneU.startsWith("PHYS") && oneU.endsWith("105") || oneU.endsWith("105L");
         checkCHEMCourseOne = oneU.startsWith("CHEM") && oneU.endsWith("3Y") || oneU.endsWith("3B");
         checkHUMCourseOne = oneU.startsWith("HUM") && oneU.endsWith("2");
         checkENGLCourseOne = (oneU.startsWith("ENGL")) && (oneU.endsWith("1C"));
      
      /* 
       * Intstantiate boolean variable, returns true if user inputs 
       * a possible course for CourseTwo. False if no match is found.
       */  
         
         String TwoU = userCrseTwo.getText();
         checkCSCICourseTwo = TwoU.startsWith("CSCI") && TwoU.endsWith("66") || TwoU.endsWith("26") ||
                                      TwoU.endsWith("13");
         checkMATHCourseTwo = TwoU.startsWith("MATH") && TwoU.endsWith("31") || TwoU.endsWith("32");
         checkPHYSCourseTwo = TwoU.startsWith("PHYS") && TwoU.endsWith("105") || TwoU.endsWith("105L");
         checkCHEMCourseTwo = TwoU.startsWith("CHEM") && TwoU.endsWith("3Y") || TwoU.endsWith("3B");
         checkHUMCourseTwo = TwoU.startsWith("HUM") && TwoU.endsWith("2");
         checkENGLCourseTwo = TwoU.startsWith("ENGL") && TwoU.endsWith("1C");
      
      /* 
       * Intstantiate boolean variable, returns true if user inputs 
       * a possible course for CourseThree. False if no match is found.
       */  
        
         String ThreeU = userCrseThree.getText();
         checkCSCICourseThree = ThreeU.startsWith("CSCI") && ThreeU.endsWith("66") || ThreeU.endsWith("26") ||
                                      ThreeU.endsWith("13");
         checkMATHCourseThree = ThreeU.startsWith("MATH") && ThreeU.endsWith("31") || ThreeU.endsWith("32");
         checkPHYSCourseThree = ThreeU.startsWith("PHYS") && ThreeU.endsWith("105") || ThreeU.endsWith("105L");
         checkCHEMCourseThree = ThreeU.startsWith("CHEM") && ThreeU.endsWith("3Y") || ThreeU.endsWith("3B");
         checkHUMCourseThree = ThreeU.startsWith("HUM") && ThreeU.endsWith("2");
         checkENGLCourseThree = ThreeU.startsWith("ENGL") && ThreeU.endsWith("1C");
         
      /* 
       * Intstantiate boolean variable, returns true if user inputs 
       * a possible course for CourseFour. False if no match is found.
       */  
         
         String FourU = userCrseFour.getText();
         checkCSCICourseFour = FourU.startsWith("CSCI") && FourU.endsWith("66") || FourU.endsWith("26") ||
                                      FourU.endsWith("13");
         checkMATHCourseFour = FourU.startsWith("MATH") && FourU.endsWith("31") || FourU.endsWith("32");
         checkPHYSCourseFour = FourU.startsWith("PHYS") && FourU.endsWith("105") || FourU.endsWith("105L");
         checkCHEMCourseFour = FourU.startsWith("CHEM") && FourU.endsWith("3Y") || FourU.endsWith("3B");
         checkHUMCourseFour = FourU.startsWith("HUM") && FourU.endsWith("2");
         checkENGLCourseFour = FourU.startsWith("ENGL") && FourU.endsWith("1C");
      
      /* 
       * Intstantiate boolean variable, returns true if user inputs 
       * a possible course for CourseFive. False if no match is found.
       */  
         
         String FiveU = userCrseFive.getText();
         checkCSCICourseFive = FiveU.startsWith("CSCI") && FiveU.endsWith("66") || FiveU.endsWith("26") ||
                                      FiveU.endsWith("13");
         checkMATHCourseFive = FiveU.startsWith("MATH") && FiveU.endsWith("31") || FiveU.endsWith("32");
         checkPHYSCourseFive = FiveU.startsWith("PHYS") && FiveU.endsWith("105") || FiveU.endsWith("105L");
         checkCHEMCourseFive = FiveU.startsWith("CHEM") && FiveU.endsWith("3Y") || FiveU.endsWith("3B");
         checkHUMCourseFive = FiveU.startsWith("HUM") && FiveU.endsWith("2");
         checkENGLCourseFive = FiveU.startsWith("ENGL") && FiveU.endsWith("1C");
         
      /* 
       * Intstantiate boolean variable, returns true if user inputs 
       * a possible course for CourseSix. False if no match is found.
       */  

         String SixU = userCrseSix.getText();
         checkCSCICourseSix = SixU.startsWith("CSCI") && SixU.endsWith("66") || SixU.endsWith("26") ||
                                      SixU.endsWith("13");
         checkMATHCourseSix = SixU.startsWith("MATH") && SixU.endsWith("31") || SixU.endsWith("32");
         checkPHYSCourseSix = SixU.startsWith("PHYS") && SixU.endsWith("105") || SixU.endsWith("105L");
         checkCHEMCourseSix = SixU.startsWith("CHEM") && SixU.endsWith("3Y") || SixU.endsWith("3B");
         checkHUMCourseSix = SixU.startsWith("HUM") && SixU.endsWith("2");
         checkENGLCourseSix = SixU.startsWith("ENGL") && SixU.endsWith("1C");
       }
       
      // If email is not verified, set all labels to "no courses"
      
       else 
       {    
         
         OneStdntA.setText("no courses");
         TwoStdntA.setText("no courses");
         ThreeStdntA.setText("no courses");
         FourStdntA.setText("no courses");
         FiveStdntA.setText("no courses");
         SixStdntA.setText("no courses");
         
         OneStdntB.setText("no courses");
         TwoStdntB.setText("no courses");
         ThreeStdntB.setText("no courses");
         FourStdntB.setText("no courses");
         FiveStdntB.setText("no courses");
         SixStdntB.setText("no courses");
         
         OneStdntC.setText("no courses");
         TwoStdntC.setText("no courses");
         ThreeStdntC.setText("no courses");
         FourStdntC.setText("no courses");
         FiveStdntC.setText("no courses");
         SixStdntC.setText("no courses");
         userEmail.setText("ENTER VALID EMAIL");      
        
       }
      
      /*
       * Checks each userCourse and places a greeen checkmark to the left 
       * of the course if there is a match. Returns "No Coures" in 
       * user text field for all non-similar courses. 
       */
     
       
       if ( (checkCSCICourseOne == true) || (checkPHYSCourseOne == true) || (checkCHEMCourseOne == true)
          || (checkHUMCourseOne == true) || (checkENGLCourseOne == true) || (checkMATHCourseOne == true)
          || (checkMATHCourseOne == true) ) 
       {
         iconOne.setImage(new Image("checkmarkOne.png"));
         userCrseOne.setStyle("-fx-text-inner-color: green;");
       }
       else 
       { 
         userCrseOne.setText("No Courses");
         userCrseOne.setStyle("-fx-text-inner-color: red;");
         iconOne.setImage(null);
       }
       
       if ( (checkCSCICourseTwo == true) || (checkPHYSCourseTwo == true) || (checkCHEMCourseTwo == true)
          || (checkHUMCourseTwo == true) || (checkENGLCourseTwo == true) || (checkMATHCourseTwo == true)
          || (checkMATHCourseTwo == true) ) 
       {
         iconTwo.setImage(new Image("checkmarkOne.png"));
         userCrseTwo.setStyle("-fx-text-inner-color: green;");
       } 
       else
       {
         userCrseTwo.setText("No Courses");
         userCrseTwo.setStyle("-fx-text-inner-color: red;");
         iconTwo.setImage(null);
       }
        
       if ( (checkCSCICourseThree == true) || (checkPHYSCourseThree == true) || (checkCHEMCourseThree == true)
          || (checkHUMCourseThree == true) || (checkENGLCourseThree == true) || (checkMATHCourseThree == true)
          || (checkMATHCourseThree == true) )
       {
         iconThree.setImage(new Image("checkmarkOne.png"));
         userCrseThree.setStyle("-fx-text-inner-color: green;");
       }  
       else 
       {
         userCrseThree.setText("No Courses");
         userCrseThree.setStyle("-fx-text-inner-color: red;");
         iconThree.setImage(null);
       }
       
       if ( (checkCSCICourseFour == true) || (checkPHYSCourseFour == true) || (checkCHEMCourseFour == true)
          || (checkHUMCourseFour == true) || (checkENGLCourseFour == true) || (checkMATHCourseFour == true)
          || (checkMATHCourseFour == true) )
       {
         iconFour.setImage(new Image("checkmarkOne.png"));
         userCrseFour.setStyle("-fx-text-inner-color: green;");
       }  
       else 
       {
         userCrseFour.setText("No Courses");
         userCrseFour.setStyle("-fx-text-inner-color: red;");
         iconFour.setImage(null);
       }
       
       if ( (checkCSCICourseFive == true) || (checkPHYSCourseFive == true) || (checkCHEMCourseFive == true)
          || (checkHUMCourseFive == true) || (checkENGLCourseFive == true) || (checkMATHCourseFive == true)
          || (checkMATHCourseFive == true) )
       {
         iconFive.setImage(new Image("checkmarkOne.png"));
         userCrseFive.setStyle("-fx-text-inner-color: green;");
       }  
       else 
       {
         userCrseFive.setText("No Courses");
         userCrseFive.setStyle("-fx-text-inner-color: red;");
         iconFive.setImage(null);
       }
       
       if ( (checkCSCICourseSix == true) || (checkPHYSCourseSix == true) || (checkCHEMCourseSix == true)
          || (checkHUMCourseSix == true) || (checkENGLCourseSix == true) || (checkMATHCourseSix == true)
          || (checkMATHCourseSix == true) )
       {
         iconSix.setImage(new Image("checkmarkOne.png"));
         userCrseSix.setStyle("-fx-text-inner-color: green;");
       }  
       else 
       {
         userCrseSix.setText("No Courses");
         userCrseSix.setStyle("-fx-text-inner-color: red;");
         iconSix.setImage(null);
       }
            
            
           
       
    }
    
 } 
    
      
  
  @Override
  public void initialize(URL url, ResourceBundle rb) {
    // TODO
  }
  
}
  



