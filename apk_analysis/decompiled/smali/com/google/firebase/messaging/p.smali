.class public final synthetic Lcom/google/firebase/messaging/p;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Landroid/content/Context;

.field public final synthetic b:Z

.field public final synthetic c:Lf5/i;


# direct methods
.method public synthetic constructor <init>(Landroid/content/Context;ZLf5/i;)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/google/firebase/messaging/p;->a:Landroid/content/Context;

    iput-boolean p2, p0, Lcom/google/firebase/messaging/p;->b:Z

    iput-object p3, p0, Lcom/google/firebase/messaging/p;->c:Lf5/i;

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 7

    .line 1
    iget-object v0, p0, Lcom/google/firebase/messaging/p;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Lcom/google/firebase/messaging/p;->c:Lf5/i;

    .line 4
    .line 5
    const-string v2, "error configuring notification delegate for package "

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    :try_start_0
    invoke-static {}, Landroid/os/Binder;->getCallingUid()I

    .line 9
    .line 10
    .line 11
    move-result v4

    .line 12
    invoke-virtual {v0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;

    .line 13
    .line 14
    .line 15
    move-result-object v5

    .line 16
    iget v5, v5, Landroid/content/pm/ApplicationInfo;->uid:I

    .line 17
    .line 18
    const/4 v6, 0x1

    .line 19
    if-ne v4, v5, :cond_0

    .line 20
    .line 21
    move v4, v6

    .line 22
    goto :goto_0

    .line 23
    :cond_0
    const/4 v4, 0x0

    .line 24
    :goto_0
    if-nez v4, :cond_1

    .line 25
    .line 26
    const-string v4, "FirebaseMessaging"

    .line 27
    .line 28
    new-instance v5, Ljava/lang/StringBuilder;

    .line 29
    .line 30
    invoke-direct {v5, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 31
    .line 32
    .line 33
    invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;

    .line 34
    .line 35
    .line 36
    move-result-object v0

    .line 37
    invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 38
    .line 39
    .line 40
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 41
    .line 42
    .line 43
    move-result-object v0

    .line 44
    invoke-static {v4, v0}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 45
    .line 46
    .line 47
    invoke-virtual {v1, v3}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 48
    .line 49
    .line 50
    return-void

    .line 51
    :catchall_0
    move-exception v0

    .line 52
    goto :goto_2

    .line 53
    :cond_1
    :try_start_1
    invoke-static {v0}, LM4/a;->r(Landroid/content/Context;)Landroid/content/SharedPreferences;

    .line 54
    .line 55
    .line 56
    move-result-object v2

    .line 57
    invoke-interface {v2}, Landroid/content/SharedPreferences;->edit()Landroid/content/SharedPreferences$Editor;

    .line 58
    .line 59
    .line 60
    move-result-object v2

    .line 61
    const-string v4, "proxy_notification_initialized"

    .line 62
    .line 63
    invoke-interface {v2, v4, v6}, Landroid/content/SharedPreferences$Editor;->putBoolean(Ljava/lang/String;Z)Landroid/content/SharedPreferences$Editor;

    .line 64
    .line 65
    .line 66
    invoke-interface {v2}, Landroid/content/SharedPreferences$Editor;->apply()V

    .line 67
    .line 68
    .line 69
    const-class v2, Landroid/app/NotificationManager;

    .line 70
    .line 71
    invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/Class;)Ljava/lang/Object;

    .line 72
    .line 73
    .line 74
    move-result-object v0

    .line 75
    check-cast v0, Landroid/app/NotificationManager;
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 76
    .line 77
    const-string v2, "com.google.android.gms"

    .line 78
    .line 79
    iget-boolean v4, p0, Lcom/google/firebase/messaging/p;->b:Z

    .line 80
    .line 81
    if-eqz v4, :cond_2

    .line 82
    .line 83
    :try_start_2
    invoke-static {v0}, LQ2/f;->i(Landroid/app/NotificationManager;)V

    .line 84
    .line 85
    .line 86
    goto :goto_1

    .line 87
    :cond_2
    invoke-static {v0}, LQ2/f;->f(Landroid/app/NotificationManager;)Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v4

    .line 91
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 92
    .line 93
    .line 94
    move-result v2

    .line 95
    if-eqz v2, :cond_3

    .line 96
    .line 97
    invoke-static {v0}, LQ2/f;->y(Landroid/app/NotificationManager;)V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 98
    .line 99
    .line 100
    :cond_3
    :goto_1
    invoke-virtual {v1, v3}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 101
    .line 102
    .line 103
    return-void

    .line 104
    :goto_2
    invoke-virtual {v1, v3}, Lf5/i;->d(Ljava/lang/Object;)V

    .line 105
    .line 106
    .line 107
    throw v0
    .line 108
.end method
