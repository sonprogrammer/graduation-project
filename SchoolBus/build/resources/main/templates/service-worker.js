self.addEventListener('push', function(event) {
    const options = {
        body: 'This is a web push notification.',
        icon: 'notification-icon.png',
        // Additional options...
    };

    event.waitUntil(
        self.registration.showNotification('Web Push Notification', options)
    );
});