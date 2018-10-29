---PLSQL


-------select single variable using type
declare 
     associateName associate.firstname%TYPE;
begin
	select firstname into associateName from Associate
		where associateID=&id;
	DBMS_OUTPUT.PUT_LINE('First name is '|| associateName);
	
END



-- select entire row into one variable using ROWTYPE
declare 
     associateRecord associate%ROWTYPE;
begin
	select * into associateRecord from Associate
		where associateID=&id;
	DBMS_OUTPUT.PUT_LINE('Assoiate Id is '|| associateRecord.associateID);
	DBMS_OUTPUT.PUT_LINE('First name is '|| associateRecord.firstname);
	DBMS_OUTPUT.PUT_LINE('Last name is '|| associateRecord.lastname);
END;

----exception handelling
declare 
     associateRecord associate%ROWTYPE;
begin
	select * into associateRecord from Associate
		where associateID=&id;
	DBMS_OUTPUT.PUT_LINE('Assoiate Id is '|| associateRecord.associateID);
	DBMS_OUTPUT.PUT_LINE('First name is '|| associateRecord.firstname);
	DBMS_OUTPUT.PUT_LINE('Last name is '|| associateRecord.lastname);
	EXCEPTION
		when 
		NO_DATA_FOUND
		then
		DBMS_OUTPUT.PUT_LINE('Data not found please contact somnath');
	END;
	
	
---- select required variables using type
declare 
	TYPE customtype is record(
		fName associate.firstname%type,
		lName associate.lastname%type);
	fullName customType;
begin 
		select firstname,lastname into fullName from Associate where associateid=&id;
	    DBMS_OUTPUT.PUT_LINE('First name is: '|| fullName.fname);
	DBMS_OUTPUT.PUT_LINE('Last name is: '|| fullName.lname);
	 
EXCEPTION
		when 
		NO_DATA_FOUND
		then
		DBMS_OUTPUT.PUT_LINE('Data not found ');
	END;	



-------- use of if else 
declare 
		n1 number(10) :=100;
		n2 number(10) :=200;
begin
			if n1>n2
			then
			DBMS_OUTPUT.PUT_LINE(n1 ||' is greater');
			else
			DBMS_OUTPUT.PUT_LINE(n1 ||' is greater');
			end if;
end;


---------use of while loop

declare 
	n1 number(10):=1;
begin
		while n1<=10
			loop 
				DBMS_OUTPUT.PUT_LINE('step '|| n1);
				n1:=n1+1;
			end loop;
end;

----except no from user and check if it is even or odd

declare 
		n1 number(10) :=&nu;
		
begin
			if mod(n1,2)=0
			then
			DBMS_OUTPUT.PUT_LINE(n1 ||' is even');
			else
			DBMS_OUTPUT.PUT_LINE(n1 ||' is odd');
			end if;
end;


--- find odd numbers between 1 to that  number
declare 
	n1 number(10):=&nu;
	ct number(10):=0;
begin
		while n1>=1
			loop 
				if mod(n1,2)!=0
				then
				ct:=ct+1;
				end if;
				n1:=n1-1;
			end loop;
			DBMS_OUTPUT.PUT_LINE(ct);
end;

----- cursor concept

declare 
	    cursor cName IS SELECT * FROM associate;
		associaterecord associate%rowtype;
begin
	  IF cName%ISOPEN
	  then
		null;
	ELSE
		 OPEN cName;
    END IF;
	
	LOOP
		FETCH cName INTO associaterecord;
		EXIT when cName%NOTFOUND;
		DBMS_OUTPUT.PUT_LINE(associaterecord.firstname ||' ' || associaterecord.lastname );
		END LOOP;
		
end;
		
---------exception with cursor programmer defined expression 

declare 
	    cursor cName IS SELECT * FROM associate where associateId=&aId;
		associaterecord associate%rowtype;
		Associate_not_found EXCEPTION;
		
begin
	  IF cName%ISOPEN
	  then
		null;
	ELSE
		 OPEN cName;
    END IF;
	
	FETCH cName INTO associateRecord;
	IF cName%NOTFOUND
		THEN 
		    RAISE Associate_not_found;
			
	ELSE
		DBMS_OUTPUT.PUT_LINE(associaterecord.firstname ||' ' || associaterecord.lastname );
	
	END IF;
	
	EXCEPTION
		when 
		ASSOCIATE_NOT_FOUND
		then
		DBMS_OUTPUT.PUT_LINE('Associate Details not found');
	
		
end;
	
-----Procedure

select * from user_errors where type='PROCEDURE' and name='INSERT_ASSOCIATE'

create or replace procedure insert_Associate(
aID in associate.associateId%type,
yInvestement in associate.yearlyInvestementunder8oc%type,
fName in associate.firstname%type,
lName in associate.lastname%type,
dep in associate.department%type,
desg in associate.designation%type,
pCard in associate.panCard%type,
eId in associate.emailId%type,
mId in associate.ManagerId%type)

is
begin
	insert into associate values(aID,yInvestement,fName,lName,dep,desg,pCard,eId,mId);
	commit;
end;

begin
 insert_associate(106,154000,'Kunal','Sharma','ADM','Con','JDNK340','KUnal@gmail.com',200);
end ;


------------function-example--------------------
-- to count total no of associates in a particular department
create or replace function associateCountFunction(depName in associate.department%type)
return number is associatecount number(10):=0;

begin 
	select count(*) into associatecount from associate where department=depName;
	return associateCount;
end;
---function call
begin 
	DBMS_OUTPUT.PUT_LINE(associateCountFunction('Software'));
end
	
-----trigger

create table associateLog(
logMessage varchar2(50),
insertDate Date);

-- trigger for insertion 
create or replace trigger
	insert_associate_trigger
	after insert on associate for each row
	
begin 
		insert into associateLog values('Insertion of Record',sysdate);
end;
-----------------trigger for updation
create or replace trigger 
	update_associate_trigger
	after update on associate for each row 

begin
	 insert into associatelog values ('Update of Record done',sysdate); 
	 
end;