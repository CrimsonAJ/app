.class public final Lb5/k1;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:Lb5/G;

.field public final synthetic c:Lb5/l1;


# direct methods
.method public synthetic constructor <init>(Lb5/l1;Lb5/G;I)V
    .locals 0

    .line 1
    iput p3, p0, Lb5/k1;->a:I

    iput-object p2, p0, Lb5/k1;->b:Lb5/G;

    iput-object p1, p0, Lb5/k1;->c:Lb5/l1;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method private final a()V
    .locals 4

    .line 1
    iget-object v0, p0, Lb5/k1;->c:Lb5/l1;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x0

    .line 5
    :try_start_0
    iput-boolean v1, v0, Lb5/l1;->a:Z

    .line 6
    .line 7
    iget-object v1, v0, Lb5/l1;->c:Lb5/m1;

    .line 8
    .line 9
    invoke-virtual {v1}, Lb5/m1;->v0()Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-nez v2, :cond_0

    .line 14
    .line 15
    iget-object v2, v1, LD/n;->a:Ljava/lang/Object;

    .line 16
    .line 17
    check-cast v2, Lb5/n0;

    .line 18
    .line 19
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 20
    .line 21
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 22
    .line 23
    .line 24
    iget-object v2, v2, Lb5/V;->n:Lb5/T;

    .line 25
    .line 26
    const-string v3, "Connected to service"

    .line 27
    .line 28
    invoke-virtual {v2, v3}, Lb5/T;->b(Ljava/lang/String;)V

    .line 29
    .line 30
    .line 31
    iget-object v2, p0, Lb5/k1;->b:Lb5/G;

    .line 32
    .line 33
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 34
    .line 35
    .line 36
    iput-object v2, v1, Lb5/m1;->d:Lb5/G;

    .line 37
    .line 38
    invoke-virtual {v1}, Lb5/m1;->B0()V

    .line 39
    .line 40
    .line 41
    invoke-virtual {v1}, Lb5/m1;->A0()V

    .line 42
    .line 43
    .line 44
    goto :goto_0

    .line 45
    :catchall_0
    move-exception v1

    .line 46
    goto :goto_1

    .line 47
    :cond_0
    :goto_0
    monitor-exit v0

    .line 48
    return-void

    .line 49
    :goto_1
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 50
    throw v1
    .line 51
    .line 52
    .line 53
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
    .line 97
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


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget v0, p0, Lb5/k1;->a:I

    .line 2
    .line 3
    packed-switch v0, :pswitch_data_0

    .line 4
    .line 5
    .line 6
    iget-object v0, p0, Lb5/k1;->c:Lb5/l1;

    .line 7
    .line 8
    monitor-enter v0

    .line 9
    const/4 v1, 0x0

    .line 10
    :try_start_0
    iput-boolean v1, v0, Lb5/l1;->a:Z

    .line 11
    .line 12
    iget-object v1, v0, Lb5/l1;->c:Lb5/m1;

    .line 13
    .line 14
    invoke-virtual {v1}, Lb5/m1;->v0()Z

    .line 15
    .line 16
    .line 17
    move-result v2

    .line 18
    if-nez v2, :cond_0

    .line 19
    .line 20
    iget-object v2, v1, LD/n;->a:Ljava/lang/Object;

    .line 21
    .line 22
    check-cast v2, Lb5/n0;

    .line 23
    .line 24
    iget-object v2, v2, Lb5/n0;->i:Lb5/V;

    .line 25
    .line 26
    invoke-static {v2}, Lb5/n0;->f(Lb5/x0;)V

    .line 27
    .line 28
    .line 29
    iget-object v2, v2, Lb5/V;->m:Lb5/T;

    .line 30
    .line 31
    const-string v3, "Connected to remote service"

    .line 32
    .line 33
    invoke-virtual {v2, v3}, Lb5/T;->b(Ljava/lang/String;)V

    .line 34
    .line 35
    .line 36
    iget-object v2, p0, Lb5/k1;->b:Lb5/G;

    .line 37
    .line 38
    invoke-virtual {v1}, Lb5/A;->l0()V

    .line 39
    .line 40
    .line 41
    iput-object v2, v1, Lb5/m1;->d:Lb5/G;

    .line 42
    .line 43
    invoke-virtual {v1}, Lb5/m1;->B0()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v1}, Lb5/m1;->A0()V

    .line 47
    .line 48
    .line 49
    goto :goto_0

    .line 50
    :catchall_0
    move-exception v1

    .line 51
    goto :goto_1

    .line 52
    :cond_0
    :goto_0
    monitor-exit v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 53
    iget-object v0, p0, Lb5/k1;->c:Lb5/l1;

    .line 54
    .line 55
    iget-object v0, v0, Lb5/l1;->c:Lb5/m1;

    .line 56
    .line 57
    iget-object v1, v0, LD/n;->a:Ljava/lang/Object;

    .line 58
    .line 59
    check-cast v1, Lb5/n0;

    .line 60
    .line 61
    iget-object v1, v1, Lb5/n0;->g:Lb5/g;

    .line 62
    .line 63
    sget-object v2, Lb5/E;->p1:Lb5/D;

    .line 64
    .line 65
    const/4 v3, 0x0

    .line 66
    invoke-virtual {v1, v3, v2}, Lb5/g;->y0(Ljava/lang/String;Lb5/D;)Z

    .line 67
    .line 68
    .line 69
    move-result v1

    .line 70
    if-eqz v1, :cond_1

    .line 71
    .line 72
    iget-object v1, v0, Lb5/m1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 73
    .line 74
    if-eqz v1, :cond_1

    .line 75
    .line 76
    invoke-interface {v1}, Ljava/util/concurrent/ExecutorService;->shutdownNow()Ljava/util/List;

    .line 77
    .line 78
    .line 79
    iput-object v3, v0, Lb5/m1;->g:Ljava/util/concurrent/ScheduledExecutorService;

    .line 80
    .line 81
    :cond_1
    return-void

    .line 82
    :goto_1
    :try_start_1
    monitor-exit v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 83
    throw v1

    .line 84
    :pswitch_0
    invoke-direct {p0}, Lb5/k1;->a()V

    .line 85
    .line 86
    .line 87
    return-void

    .line 88
    nop

    .line 89
    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_0
    .end packed-switch
    .line 90
    .line 91
    .line 92
    .line 93
    .line 94
    .line 95
    .line 96
    .line 97
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
