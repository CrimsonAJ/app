.class public final Ld7/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:I

.field public final synthetic b:J

.field public final synthetic c:LD0/b;


# direct methods
.method public constructor <init>(LD0/b;IJ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Ld7/b;->c:LD0/b;

    .line 5
    .line 6
    iput p2, p0, Ld7/b;->a:I

    .line 7
    .line 8
    iput-wide p3, p0, Ld7/b;->b:J

    .line 9
    .line 10
    return-void
    .line 11
    .line 12
    .line 13
    .line 14
    .line 15
    .line 16
    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    .line 22
    .line 23
    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    .line 42
    .line 43
    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    .line 49
    .line 50
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
    .line 109
    .line 110
    .line 111
    .line 112
    .line 113
    .line 114
    .line 115
    .line 116
    .line 117
    .line 118
    .line 119
    .line 120
    .line 121
    .line 122
    .line 123
    .line 124
    .line 125
    .line 126
    .line 127
    .line 128
    .line 129
    .line 130
    .line 131
    .line 132
    .line 133
    .line 134
    .line 135
    .line 136
.end method


# virtual methods
.method public final run()V
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    iget-object v2, p0, Ld7/b;->c:LD0/b;

    .line 3
    .line 4
    iget v1, p0, Ld7/b;->a:I

    .line 5
    .line 6
    iget-wide v5, p0, Ld7/b;->b:J

    .line 7
    .line 8
    monitor-enter v2

    .line 9
    add-int/lit8 v7, v1, -0x1

    .line 10
    .line 11
    rsub-int/lit8 v1, v7, 0x3

    .line 12
    .line 13
    :try_start_0
    iget-object v3, v2, LD0/b;->d:Ljava/lang/Object;

    .line 14
    .line 15
    check-cast v3, Ld7/i;

    .line 16
    .line 17
    invoke-virtual {v3, v1}, Ld7/i;->c(I)Lf5/q;

    .line 18
    .line 19
    .line 20
    move-result-object v3

    .line 21
    iget-object v1, v2, LD0/b;->e:Ljava/lang/Object;

    .line 22
    .line 23
    check-cast v1, Ld7/d;

    .line 24
    .line 25
    invoke-virtual {v1}, Ld7/d;->b()Lf5/h;

    .line 26
    .line 27
    .line 28
    move-result-object v4

    .line 29
    const/4 v1, 0x2

    .line 30
    new-array v1, v1, [Lf5/h;

    .line 31
    .line 32
    const/4 v8, 0x0

    .line 33
    aput-object v3, v1, v8

    .line 34
    .line 35
    aput-object v4, v1, v0

    .line 36
    .line 37
    invoke-static {v1}, Ls8/n;->D([Lf5/h;)Lf5/q;

    .line 38
    .line 39
    .line 40
    move-result-object v0

    .line 41
    iget-object v1, v2, LD0/b;->g:Ljava/lang/Object;

    .line 42
    .line 43
    move-object v8, v1

    .line 44
    check-cast v8, Ljava/util/concurrent/ScheduledExecutorService;

    .line 45
    .line 46
    new-instance v1, Ld7/a;

    .line 47
    .line 48
    invoke-direct/range {v1 .. v7}, Ld7/a;-><init>(LD0/b;Lf5/q;Lf5/h;JI)V

    .line 49
    .line 50
    .line 51
    invoke-virtual {v0, v8, v1}, Lf5/q;->e(Ljava/util/concurrent/Executor;Lf5/a;)Lf5/q;
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 52
    .line 53
    .line 54
    monitor-exit v2

    .line 55
    return-void

    .line 56
    :catchall_0
    move-exception v0

    .line 57
    :try_start_1
    monitor-exit v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 58
    throw v0
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
