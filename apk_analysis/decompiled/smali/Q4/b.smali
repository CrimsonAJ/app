.class public final LQ4/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/util/concurrent/Callable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ljava/lang/Object;


# direct methods
.method public synthetic constructor <init>(ILjava/lang/Object;)V
    .locals 0

    .line 1
    iput p1, p0, LQ4/b;->a:I

    iput-object p2, p0, LQ4/b;->b:Ljava/lang/Object;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(Lb5/w0;Lb5/t;Ljava/lang/String;)V
    .locals 0

    const/4 p2, 0x2

    iput p2, p0, LQ4/b;->a:I

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, LQ4/b;->b:Ljava/lang/Object;

    return-void
.end method


# virtual methods
.method public final call()Ljava/lang/Object;
    .locals 5

    .line 1
    iget v0, p0, LQ4/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ4/b;->b:Ljava/lang/Object;

    .line 7
    .line 8
    check-cast v0, Lo0/a;

    .line 9
    .line 10
    iget-object v1, v0, Lo0/a;->d:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 11
    .line 12
    const/4 v2, 0x1

    .line 13
    invoke-virtual {v1, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 14
    .line 15
    .line 16
    const/16 v1, 0xa

    .line 17
    .line 18
    const/4 v3, 0x0

    .line 19
    :try_start_0
    invoke-static {v1}, Landroid/os/Process;->setThreadPriority(I)V

    .line 20
    .line 21
    .line 22
    iget-object v1, v0, Lo0/a;->e:Ls4/d;

    .line 23
    .line 24
    invoke-virtual {v1}, Ls4/d;->d()V

    .line 25
    .line 26
    .line 27
    invoke-static {}, Landroid/os/Binder;->flushPendingCommands()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 28
    .line 29
    .line 30
    invoke-virtual {v0, v3}, Lo0/a;->a(Ljava/lang/Object;)V

    .line 31
    .line 32
    .line 33
    return-object v3

    .line 34
    :catchall_0
    move-exception v1

    .line 35
    :try_start_1
    iget-object v4, v0, Lo0/a;->c:Ljava/util/concurrent/atomic/AtomicBoolean;

    .line 36
    .line 37
    invoke-virtual {v4, v2}, Ljava/util/concurrent/atomic/AtomicBoolean;->set(Z)V

    .line 38
    .line 39
    .line 40
    throw v1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    .line 41
    :catchall_1
    move-exception v1

    .line 42
    invoke-virtual {v0, v3}, Lo0/a;->a(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    throw v1

    .line 46
    :pswitch_0
    iget-object v0, p0, LQ4/b;->b:Ljava/lang/Object;

    .line 47
    .line 48
    check-cast v0, Lb5/w0;

    .line 49
    .line 50
    iget-object v1, v0, Lb5/w0;->e:Lb5/J1;

    .line 51
    .line 52
    invoke-virtual {v1}, Lb5/J1;->e()V

    .line 53
    .line 54
    .line 55
    iget-object v0, v0, Lb5/w0;->e:Lb5/J1;

    .line 56
    .line 57
    iget-object v0, v0, Lb5/J1;->h:Lb5/Z;

    .line 58
    .line 59
    invoke-static {v0}, Lb5/J1;->J(Lb5/D1;)V

    .line 60
    .line 61
    .line 62
    invoke-virtual {v0}, LD/n;->l0()V

    .line 63
    .line 64
    .line 65
    new-instance v0, Ljava/lang/IllegalStateException;

    .line 66
    .line 67
    const-string v1, "Unexpected call on client side"

    .line 68
    .line 69
    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 70
    .line 71
    .line 72
    throw v0

    .line 73
    :pswitch_1
    new-instance v0, Lcom/google/android/gms/internal/measurement/I1;

    .line 74
    .line 75
    iget-object v1, p0, LQ4/b;->b:Ljava/lang/Object;

    .line 76
    .line 77
    check-cast v1, Lb5/i0;

    .line 78
    .line 79
    iget-object v1, v1, Lb5/i0;->k:Ls4/i;

    .line 80
    .line 81
    invoke-direct {v0, v1}, Lcom/google/android/gms/internal/measurement/I1;-><init>(Ls4/i;)V

    .line 82
    .line 83
    .line 84
    return-object v0

    .line 85
    :pswitch_2
    const-string v0, "google_sdk_flags"

    .line 86
    .line 87
    const/4 v1, 0x0

    .line 88
    iget-object v2, p0, LQ4/b;->b:Ljava/lang/Object;

    .line 89
    .line 90
    check-cast v2, Landroid/content/Context;

    .line 91
    .line 92
    invoke-virtual {v2, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 93
    .line 94
    .line 95
    move-result-object v0

    .line 96
    return-object v0

    .line 97
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 98
    .line 99
    .line 100
    .line 101
    .line 102
    .line 103
    .line 104
    .line 105
    .line 106
    .line 107
    .line 108
.end method
