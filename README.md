![image](https://github.com/user-attachments/assets/e710d4f4-9c5f-478e-bf71-313aa2936619)


Keep your code clean according to MVVM

Yes , liveData is easy , powerful , but you should know how to use.
For livedate which will emit data stream , it has to be in your data layer , and don't inform those observables any thing else like in which thread those will consume , cause it is another
For livedata which will emit UI binding events, it has to be in your ViewModel Layer.
Observers in UI Consume and react to live data values and bind it. responsibility , and according to Single responsibility principle in SOLID (object-oriented design) , so don't break this concept by mixing the responsibilities .

![image](https://github.com/user-attachments/assets/e2080d75-e9be-4719-af63-43c11e911279)
