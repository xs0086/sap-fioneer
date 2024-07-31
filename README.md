
Loan Management Application
Overview
This Spring Boot application is designed to manage various types of bank loans. The core functionality includes creating, managing, and searching for different loan types, each with its own processing procedure.

Features
Create Loan Types: Bank employees can create different loan types, each with a unique name.
Define Loan Processing Procedures: For each loan type, a procedure can be defined with steps, where each step has a name, order number, and expected duration.
Search and Display Loan Types: Employees can search for loan types by name and view details including the total expected duration and a list of processing steps.


Entity Classes

"LoanType"
Represents a type of loan with a unique name and an associated processing procedure.

Attributes:
id: Unique identifier for the loan type.
name: Name of the loan type.
procedure: Associated LoanProcedureStep list.


"LoanProcedureStep"
Represents a step in the processing procedure of a loan type.

Attributes:
id: Unique identifier for the procedure step.
name: Name of the step.
orderNumber: Order of the step in the procedure.
expectedDurationDays: Expected duration of the step in days.
loanType: Associated LoanType.

Controllers
LoanTypeController: Manages operations related to loan types, including creation, search, and detail retrieval.
LoanProcedureStepController: Handles CRUD operations for loan procedure steps.


Repositories
LoanTypeRepository: Provides methods to interact with LoanType entities in the SQLite database.
LoanProcedureStepRepository: Provides methods to interact with LoanProcedureStep entities in the SQLite database.


Services
LoanTypeService: Contains business logic for managing loan types and their procedures.
LoanProcedureStepService: Contains business logic for managing procedure steps related to loan types.

Database
SQLite Database: The application uses an SQLite database named database to persist loan types and procedure steps.

API Documentation
API endpoints are documented using OpenAPI (Swagger). 