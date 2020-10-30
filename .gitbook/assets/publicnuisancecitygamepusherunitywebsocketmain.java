Pusher pusher = new Pusher("1085113", "dce31eb72b538e27a30f", "990b268c597083c7946e");
pusher.setCluster("mt1");
pusher.setEncrypted(true);

pusher.trigger("my-channel", "my-event", Collections.singletonMap("message", "hello world"));
