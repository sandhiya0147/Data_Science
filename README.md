# Data_Science
MINI PROJECT TASK1:

Title:"Predictive Insights for College Admission and Performance"

Problem Statement:
You are working as a data analyst for a university, The admissions department has provided you with a dataset containing the features of past students.

Task is to:
1. Analyse the dataset and identify the nature of the problem to be solved.
2. Determine the type of output (numerical, binary, or multi-class categorical).
3. Based on the target column(s) provided, choose the correct algorithm (from Linear Regression,
Logistic Regression, or Decision Tree Classifier).
4. Justify your choice with proper explanation.
5. Build and evaluate the model accordingly.

Here's what i have build:
1. created a dataset which contains the given past insights.
2. In google colab, analysed and preprocessed the dataset.
     Key Observations:
          20 samples with 8 features
          No missing values (good!)
          Mixed data types (categorical + numerical)
          Target variable: Final_yearres (pass/fail)
3.Used Logistic Regression to build and evaluate model as  it's perfect for binary classification (pass/fail) with interpretable results and works well on small datasets.
  It clearly shows how each factor (like GPA or study hours) affects the outcome through coefficients.

Key Findings:
1.Data Insights:
     Class imbalance: 75% pass vs 25% fail.

2.Model Performance:
      Logistic Regression accuracy: ~85%.

      This analysis provides a complete workflow from data exploration to model deployment, with clear interpretation of results. The logistic regression model shows good performance with 85% accuracy, and we've identified the most important predictive features.
