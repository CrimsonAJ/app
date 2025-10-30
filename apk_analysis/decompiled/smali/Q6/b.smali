.class public final synthetic LQ6/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ls6/d;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Ls6/p;


# direct methods
.method public synthetic constructor <init>(Ls6/p;I)V
    .locals 0

    .line 1
    iput p2, p0, LQ6/b;->a:I

    iput-object p1, p0, LQ6/b;->b:Ls6/p;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final e(LY2/r;)Ljava/lang/Object;
    .locals 6

    .line 1
    iget v0, p0, LQ6/b;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, LQ6/b;->b:Ls6/p;

    .line 7
    .line 8
    invoke-static {v0, p1}, Lcom/google/firebase/messaging/FirebaseMessagingRegistrar;->a(Ls6/p;LY2/r;)Lcom/google/firebase/messaging/FirebaseMessaging;

    .line 9
    .line 10
    .line 11
    move-result-object p1

    .line 12
    return-object p1

    .line 13
    :pswitch_0
    iget-object v0, p0, LQ6/b;->b:Ls6/p;

    .line 14
    .line 15
    invoke-static {v0, p1}, Lcom/google/firebase/remoteconfig/RemoteConfigRegistrar;->a(Ls6/p;LY2/r;)Lc7/n;

    .line 16
    .line 17
    .line 18
    move-result-object p1

    .line 19
    return-object p1

    .line 20
    :pswitch_1
    new-instance v0, LQ6/e;

    .line 21
    .line 22
    const-class v1, Landroid/content/Context;

    .line 23
    .line 24
    invoke-virtual {p1, v1}, LY2/r;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v1

    .line 28
    check-cast v1, Landroid/content/Context;

    .line 29
    .line 30
    const-class v2, Ll6/f;

    .line 31
    .line 32
    invoke-virtual {p1, v2}, LY2/r;->b(Ljava/lang/Class;)Ljava/lang/Object;

    .line 33
    .line 34
    .line 35
    move-result-object v2

    .line 36
    check-cast v2, Ll6/f;

    .line 37
    .line 38
    invoke-virtual {v2}, Ll6/f;->d()Ljava/lang/String;

    .line 39
    .line 40
    .line 41
    move-result-object v2

    .line 42
    const-class v3, LQ6/f;

    .line 43
    .line 44
    invoke-virtual {p1, v3}, LY2/r;->M(Ljava/lang/Class;)Ljava/util/Set;

    .line 45
    .line 46
    .line 47
    move-result-object v3

    .line 48
    const-class v4, Lb7/b;

    .line 49
    .line 50
    invoke-virtual {p1, v4}, LY2/r;->h(Ljava/lang/Class;)LS6/b;

    .line 51
    .line 52
    .line 53
    move-result-object v4

    .line 54
    iget-object v5, p0, LQ6/b;->b:Ls6/p;

    .line 55
    .line 56
    invoke-virtual {p1, v5}, LY2/r;->d(Ls6/p;)Ljava/lang/Object;

    .line 57
    .line 58
    .line 59
    move-result-object p1

    .line 60
    move-object v5, p1

    .line 61
    check-cast v5, Ljava/util/concurrent/Executor;

    .line 62
    .line 63
    invoke-direct/range {v0 .. v5}, LQ6/e;-><init>(Landroid/content/Context;Ljava/lang/String;Ljava/util/Set;LS6/b;Ljava/util/concurrent/Executor;)V

    .line 64
    .line 65
    .line 66
    return-object v0

    .line 67
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_1
        :pswitch_0
    .end packed-switch
    .line 68
    .line 69
    .line 70
    .line 71
    .line 72
    .line 73
    .line 74
    .line 75
    .line 76
    .line 77
    .line 78
    .line 79
    .line 80
    .line 81
    .line 82
    .line 83
    .line 84
    .line 85
    .line 86
    .line 87
    .line 88
    .line 89
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
.end method
