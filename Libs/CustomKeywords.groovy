
/**
 * This class is generated automatically by Katalon Studio and should not be modified or deleted.
 */

import java.lang.String

import com.kms.katalon.core.testobject.TestObject


def static "utils.Registration.Register"(
    	String username	
     , 	String password	) {
    (new utils.Registration()).Register(
        	username
         , 	password)
}

def static "utils.Registration.Login"(
    	String username	
     , 	String password	) {
    (new utils.Registration()).Login(
        	username
         , 	password)
}

def static "utils.Registration.GenerateName"(
    	String prefix	) {
    (new utils.Registration()).GenerateName(
        	prefix)
}

def static "utils.Registration.GetMail"(
    	String name	) {
    (new utils.Registration()).GetMail(
        	name)
}

def static "utils.Registration.GetPassword"() {
    (new utils.Registration()).GetPassword()
}

def static "utils.Registration.Verification"(
    	String username	) {
    (new utils.Registration()).Verification(
        	username)
}

def static "dnd.DragAndDropHelper.dragAndDrop"(
    	TestObject sourceObject	
     , 	TestObject destinationObject	) {
    (new dnd.DragAndDropHelper()).dragAndDrop(
        	sourceObject
         , 	destinationObject)
}
