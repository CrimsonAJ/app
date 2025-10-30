.class public final synthetic Lt6/c;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lt6/g;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lt6/f;

.field public final synthetic c:Ljava/lang/Runnable;

.field public final synthetic d:J

.field public final synthetic e:J

.field public final synthetic f:Ljava/util/concurrent/TimeUnit;


# direct methods
.method public synthetic constructor <init>(Lt6/f;Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;I)V
    .locals 0

    .line 1
    iput p8, p0, Lt6/c;->a:I

    iput-object p1, p0, Lt6/c;->b:Lt6/f;

    iput-object p2, p0, Lt6/c;->c:Ljava/lang/Runnable;

    iput-wide p3, p0, Lt6/c;->d:J

    iput-wide p5, p0, Lt6/c;->e:J

    iput-object p7, p0, Lt6/c;->f:Ljava/util/concurrent/TimeUnit;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public final a(Lcom/google/firebase/messaging/u;)Ljava/util/concurrent/ScheduledFuture;
    .locals 8

    .line 1
    iget v0, p0, Lt6/c;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lt6/c;->b:Lt6/f;

    .line 7
    .line 8
    new-instance v2, Lt6/d;

    .line 9
    .line 10
    iget-object v1, p0, Lt6/c;->c:Ljava/lang/Runnable;

    .line 11
    .line 12
    const/4 v3, 0x2

    .line 13
    invoke-direct {v2, v0, v1, p1, v3}, Lt6/d;-><init>(Lt6/f;Ljava/lang/Runnable;Lcom/google/firebase/messaging/u;I)V

    .line 14
    .line 15
    .line 16
    iget-wide v5, p0, Lt6/c;->e:J

    .line 17
    .line 18
    iget-object v7, p0, Lt6/c;->f:Ljava/util/concurrent/TimeUnit;

    .line 19
    .line 20
    iget-object v1, v0, Lt6/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 21
    .line 22
    iget-wide v3, p0, Lt6/c;->d:J

    .line 23
    .line 24
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleWithFixedDelay(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 25
    .line 26
    .line 27
    move-result-object p1

    .line 28
    return-object p1

    .line 29
    :pswitch_0
    iget-object v0, p0, Lt6/c;->b:Lt6/f;

    .line 30
    .line 31
    new-instance v2, Lt6/d;

    .line 32
    .line 33
    iget-object v1, p0, Lt6/c;->c:Ljava/lang/Runnable;

    .line 34
    .line 35
    const/4 v3, 0x0

    .line 36
    invoke-direct {v2, v0, v1, p1, v3}, Lt6/d;-><init>(Lt6/f;Ljava/lang/Runnable;Lcom/google/firebase/messaging/u;I)V

    .line 37
    .line 38
    .line 39
    iget-wide v5, p0, Lt6/c;->e:J

    .line 40
    .line 41
    iget-object v7, p0, Lt6/c;->f:Ljava/util/concurrent/TimeUnit;

    .line 42
    .line 43
    iget-object v1, v0, Lt6/f;->b:Ljava/util/concurrent/ScheduledExecutorService;

    .line 44
    .line 45
    iget-wide v3, p0, Lt6/c;->d:J

    .line 46
    .line 47
    invoke-interface/range {v1 .. v7}, Ljava/util/concurrent/ScheduledExecutorService;->scheduleAtFixedRate(Ljava/lang/Runnable;JJLjava/util/concurrent/TimeUnit;)Ljava/util/concurrent/ScheduledFuture;

    .line 48
    .line 49
    .line 50
    move-result-object p1

    .line 51
    return-object p1

    .line 52
    nop

    .line 53
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 54
    .line 55
    .line 56
    .line 57
    .line 58
    .line 59
    .line 60
    .line 61
    .line 62
    .line 63
    .line 64
    .line 65
    .line 66
    .line 67
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
