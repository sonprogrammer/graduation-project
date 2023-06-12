import matplotlib.pyplot as plt
import numpy as np
import tensorflow as tf
from tensorflow import keras
from tensorflow.keras import layers

x = np.array([2.5, 2.8, 2.2, 1.0, 4.9, 1.8, 10.6, 2.7, 8.8, 4.0, 1.0, 3.5, 9.0, 9.9, 1.4, 14.6, 1.9, 0.1, 6.3, 5.9, 7.2, 2.8, 3.8, 6.6, 0.6, 0.3, 1.8, 6.6, 8.0, 2.6, 2.6, 9.6, 6.7, 13.3, 0.9, 8.0, 0.5, 1.8, 1.4, 0.3, 5.4, 0.7, 5.3, 2.6, 0.7, 2.4, 0.8, 13.7, 2.4, 1.4, 13.6, 1.8, 5.8, 2.1, 2.6, 0.9, 3.2, 2.7, 2.7, 1.1, 0.1, 4.2, 1.9, 5.4, 0.4, 7.4, 1.3, 2.0, 2.4, 2.9, 1.5, 4.7, 13.8, 3.6, 4.8, 2.6, 3.3, 4.5, 7.3, 5.7, 1.0, 5.9, 1.7, 14.5, 2.8, 3.0, 1.9, 2.5, 0.9, 0.2, 4.4, 9.9, 1.5, 0.4, 5.5, 1.1, 0.6, 5.1, 0.6, 2.1, 5.8, 0.4, 0.0, 2.8, 2.0, 0.7, 1.4, 2.0, 1.8, 12.5, 2.8, 3.2, 5.1, 4.3, 6.9, 1.9, 0.4, 0.9, 2.8, 8.7, 0.8, 2.8, 2.1, 4.1, 3.6, 3.6, 2.5, 2.8, 0.5, 3.8, 0.1], dtype=np.float32)
y = np.array([0.5, 0.1, 0, 1.1, 3.8, 0.3, 41.1, 0.1, 15.6, 5.6, 0, 9.6, 11.7, 12.9, 0.1, 71, 0, 0, 12.4, 4.4, 25.3, 0, 4.6, 23.9, 0.1, 0, 0.1, 26.4, 20.7, 0.3, 1.4, 13.2, 12.1, 39.4, 0, 15, 0.4, 0, 1.7, 0, 23.3, 0.1, 5.4, 0, 0.2, 0, 0, 66.5, 0, 0.4, 52.5, 1.5, 13.9, 1.7, 1.7, 0, 2.3, 0.1, 0, 1.1, 0.1, 2.1, 0.2, 5.9, 2, 13.2, 0.6, 2, 0, 0, 0, 2.7, 56.4, 6.7, 6.2, 0.1, 8.5, 9.7, 11.3, 3.6, 0.3, 3.9, 0.2, 38.1, 0, 2.1, 0.8, 0.8, 0.2, 0.1, 5.7, 13.8, 0, 0, 14.1, 0, 1.2, 4.8, 0, 2.2, 5.5, 1.9, 0, 7.1, 1.8, 0, 2, 0, 1.6, 56.3, 0, 2.5, 7.5, 3.1, 11.3, 0, 0, 0.2, 0.2, 20.9, 0.2, 0, 3.5, 4.6, 6.3, 5.7, 2.3, 0.3, 0.4, 4.5, 0.1], dtype=np.float32)

# 모델 구성
model = keras.Sequential()
model.add(layers.Dense(10, activation='relu', input_shape=(1,)))
model.add(layers.Dense(10, activation='relu'))
model.add(layers.Dense(1))

# 모델 컴파일
model.compile(optimizer='adam', loss='mean_squared_error')

# 모델 학습
history = model.fit(x, y, epochs=1000, verbose=0)

# 예측
x_pred = np.linspace(0, 17, 100)
y_pred = model.predict(x_pred)

weights = model.get_weights()
w1, b1, w2, b2, w3, b3 = weights[0][0][0], weights[1][0], weights[2][0][0], weights[3][0], weights[4][0][0], weights[5][0]
print(f"학습된 식: y = {w1:.2f} * relu({w2:.2f} * relu({w3:.2f} * x + {b3:.2f}) + {b2:.2f}) + {b1:.2f}")

# 시각화
plt.scatter(x, y)
plt.plot(x_pred, y_pred, color='red')
plt.xlabel('x')
plt.ylabel('y')
plt.title('Nonlinear Regression')
plt.show()

# 사용자로부터 x 값 입력 받기
while True:
    x_test = float(input("Enter a value for x: "))
    y_test = model.predict(np.array([x_test]))
    print(f"Predicted y for x={x_test}: {y_test[0][0]:.2f}")

# 아래의 주소로 실습하면 됨
# https://colab.research.google.com/drive/1TKbeE3lWLYK1ioQUBhe7SVE8B1CQk6Dd?usp=sharing