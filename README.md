# SignScore
Machine Learning Model used to interpret ASL motions into text in real time
---------------------------------------------------------------------------
Our team had always been interested in machine learning and AI models but did not have as much as experience as we desired. While discussing how we can apply this interest to a real-world field, we noticed that there are not many fully interactive platforms for users to learn American Sign Language, as there are for many other languages. With accessibility in mind, we decided to begin with the heart of this type of application, the ML model that would determine if users are signing correctly. 

Built in a jupyter notebook, we utilized TensorFlow and the adjacent Keras libraries in order to develop a model we can train. Then, using the mediapipe library, we were able to map out keypoints of the human body and establish the landmarks that will be used as tracking data. Using open-cv, we were able to use the device webcam to capture frames of the motion and gather data to train our model.

This model is only meant to be the centerpiece for a greater project intended to help non-ASL speakers learn how to sign. SignScore will be developed into a web application that acts similarly to services like Duolingo, containing lessons and specialized questions for users to learn about ASL. This current model will be applied to allow users to use their webcams in order to test out their signing abilities throughout lessons.


**TO RUN A PRE-TRAINED MODEL, DOWNLOAD THE "trained_models" FOLDER, AND RUN THE SCRIPT LABELED "RunPreTrainedModels".**
