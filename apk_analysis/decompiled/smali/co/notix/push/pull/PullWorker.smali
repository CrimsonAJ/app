.class public final Lco/notix/push/pull/PullWorker;
.super Lco/notix/worker/SelfRestartingWorker;
.source "SourceFile"


# static fields
.field public static final f:J

.field public static final g:J


# instance fields
.field public final a:Lco/notix/df;

.field public final b:Lco/notix/l2;

.field public final c:Lco/notix/sk;

.field public final d:Lco/notix/mq;

.field public final e:Lco/notix/zk;


# direct methods
.method public static constructor <clinit>()V
    .locals 3

    sget-object v0, Ljava/util/concurrent/TimeUnit;->DAYS:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0x1

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lco/notix/push/pull/PullWorker;->f:J

    sget-object v0, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    const-wide/16 v1, 0xf

    invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    sput-wide v0, Lco/notix/push/pull/PullWorker;->g:J

    return-void
.end method

.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/notix/worker/SelfRestartingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Lco/notix/wq;->m()Lco/notix/df;

    move-result-object p1

    iput-object p1, p0, Lco/notix/push/pull/PullWorker;->a:Lco/notix/df;

    invoke-static {}, Lco/notix/wq;->a()Lco/notix/l2;

    move-result-object p1

    iput-object p1, p0, Lco/notix/push/pull/PullWorker;->b:Lco/notix/l2;

    invoke-static {}, Lco/notix/wq;->A()Lco/notix/sk;

    move-result-object p1

    iput-object p1, p0, Lco/notix/push/pull/PullWorker;->c:Lco/notix/sk;

    invoke-static {}, Lco/notix/wq;->E()Lco/notix/mq;

    move-result-object p1

    iput-object p1, p0, Lco/notix/push/pull/PullWorker;->d:Lco/notix/mq;

    invoke-static {}, Lco/notix/wq;->B()Lco/notix/zk;

    move-result-object p1

    iput-object p1, p0, Lco/notix/push/pull/PullWorker;->e:Lco/notix/zk;

    return-void
.end method


# virtual methods
.method public final a()Lco/notix/ap;
    .locals 1

    .line 5
    iget-object v0, p0, Lco/notix/push/pull/PullWorker;->e:Lco/notix/zk;

    return-object v0
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 20

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lco/notix/al;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lco/notix/al;

    iget v3, v2, Lco/notix/al;->h:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lco/notix/al;->h:I

    goto :goto_0

    :cond_0
    new-instance v2, Lco/notix/al;

    invoke-direct {v2, v0, v1}, Lco/notix/al;-><init>(Lco/notix/push/pull/PullWorker;LE7/d;)V

    :goto_0
    iget-object v1, v2, Lco/notix/al;->f:Ljava/lang/Object;

    sget-object v3, LF7/a;->a:LF7/a;

    iget v4, v2, Lco/notix/al;->h:I

    const/4 v5, 0x4

    const/4 v6, 0x3

    const/4 v7, 0x2

    const/4 v8, 0x1

    if-eqz v4, :cond_5

    if-eq v4, v8, :cond_4

    if-eq v4, v7, :cond_3

    if-eq v4, v6, :cond_2

    if-ne v4, v5, :cond_1

    iget-wide v3, v2, Lco/notix/al;->c:J

    iget-wide v5, v2, Lco/notix/al;->b:J

    iget v7, v2, Lco/notix/al;->e:I

    iget v2, v2, Lco/notix/al;->d:I

    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget v4, v2, Lco/notix/al;->d:I

    iget-wide v6, v2, Lco/notix/al;->c:J

    iget-wide v9, v2, Lco/notix/al;->b:J

    iget-object v11, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    goto/16 :goto_4

    :cond_3
    iget-wide v9, v2, Lco/notix/al;->c:J

    iget-wide v11, v2, Lco/notix/al;->b:J

    iget-object v4, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_3

    :cond_4
    iget-wide v9, v2, Lco/notix/al;->b:J

    iget-object v4, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    goto :goto_1

    :cond_5
    invoke-static {v1}, La/a;->A(Ljava/lang/Object;)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v9

    iget-object v1, v0, Lco/notix/push/pull/PullWorker;->c:Lco/notix/sk;

    iput-object v0, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    iput-wide v9, v2, Lco/notix/al;->b:J

    iput v8, v2, Lco/notix/al;->h:I

    invoke-virtual {v1, v2}, Lco/notix/sk;->c(LE7/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto/16 :goto_5

    :cond_6
    move-object v4, v0

    :goto_1
    check-cast v1, Ljava/lang/Long;

    if-eqz v1, :cond_7

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v11

    goto :goto_2

    :cond_7
    const-wide/16 v11, 0x0

    :goto_2
    iget-object v1, v4, Lco/notix/push/pull/PullWorker;->c:Lco/notix/sk;

    iput-object v4, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    iput-wide v9, v2, Lco/notix/al;->b:J

    iput-wide v11, v2, Lco/notix/al;->c:J

    iput v7, v2, Lco/notix/al;->h:I

    invoke-virtual {v1, v9, v10, v2}, Lco/notix/sk;->b(JLE7/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    goto :goto_5

    :cond_8
    move-wide/from16 v18, v11

    move-wide v11, v9

    move-wide/from16 v9, v18

    :goto_3
    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v1

    iget-object v7, v4, Lco/notix/push/pull/PullWorker;->c:Lco/notix/sk;

    iput-object v4, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    iput-wide v11, v2, Lco/notix/al;->b:J

    iput-wide v9, v2, Lco/notix/al;->c:J

    iput v1, v2, Lco/notix/al;->d:I

    iput v6, v2, Lco/notix/al;->h:I

    invoke-virtual {v7, v2}, Lco/notix/sk;->b(LE7/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_9

    goto :goto_5

    :cond_9
    move-object/from16 v18, v4

    move v4, v1

    move-object v1, v6

    move-wide v6, v9

    move-wide v9, v11

    move-object/from16 v11, v18

    :goto_4
    check-cast v1, Ljava/lang/Integer;

    if-eqz v1, :cond_a

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v8

    :cond_a
    sget-wide v12, Lco/notix/push/pull/PullWorker;->f:J

    int-to-long v14, v8

    div-long v14, v12, v14

    move-wide/from16 v16, v6

    int-to-long v5, v4

    mul-long/2addr v5, v14

    sub-long v9, v9, v16

    invoke-static {v12, v13, v9, v10}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v9

    iget-object v1, v11, Lco/notix/push/pull/PullWorker;->d:Lco/notix/mq;

    const/4 v7, 0x0

    iput-object v7, v2, Lco/notix/al;->a:Lco/notix/push/pull/PullWorker;

    iput v4, v2, Lco/notix/al;->d:I

    iput v8, v2, Lco/notix/al;->e:I

    iput-wide v5, v2, Lco/notix/al;->b:J

    iput-wide v9, v2, Lco/notix/al;->c:J

    const/4 v7, 0x4

    iput v7, v2, Lco/notix/al;->h:I

    invoke-virtual {v1, v2}, Lco/notix/mq;->e(LE7/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_b

    :goto_5
    return-object v3

    :cond_b
    move v2, v4

    move v7, v8

    move-wide v3, v9

    :goto_6
    check-cast v1, Lco/notix/pp;

    if-eqz v1, :cond_c

    .line 1
    iget-object v1, v1, Lco/notix/pp;->a:Lco/notix/np;

    if-eqz v1, :cond_c

    .line 2
    iget-object v1, v1, Lco/notix/np;->d:Ljava/lang/Long;

    if-eqz v1, :cond_c

    .line 3
    invoke-virtual {v1}, Ljava/lang/Number;->longValue()J

    move-result-wide v8

    sget-object v1, Ljava/util/concurrent/TimeUnit;->SECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {v1, v8, v9}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v8

    goto :goto_7

    :cond_c
    sget-wide v8, Lco/notix/push/pull/PullWorker;->g:J

    :goto_7
    sub-long v10, v5, v3

    invoke-static {v10, v11, v8, v9}, Ljava/lang/Math;->max(JJ)J

    move-result-wide v10

    sget-object v1, Lco/notix/md;->a:Lco/notix/kd;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "scheduling next pull. impressionCount="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", adFreq="

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ", desiredTimeMillis="

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v5, v6}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", passedTimeMillis="

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", adMinimalDelay="

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8, v9}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v2, ", nextDelay="

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10, v11}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const/16 v2, 0x2e

    invoke-virtual {v12, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1, v2}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 4
    new-instance v1, Ljava/lang/Long;

    invoke-direct {v1, v10, v11}, Ljava/lang/Long;-><init>(J)V

    return-object v1
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 6

    .line 1
    instance-of v0, p1, Lco/notix/bl;

    .line 2
    .line 3
    if-eqz v0, :cond_0

    .line 4
    .line 5
    move-object v0, p1

    .line 6
    check-cast v0, Lco/notix/bl;

    .line 7
    .line 8
    iget v1, v0, Lco/notix/bl;->d:I

    .line 9
    .line 10
    const/high16 v2, -0x80000000

    .line 11
    .line 12
    and-int v3, v1, v2

    .line 13
    .line 14
    if-eqz v3, :cond_0

    .line 15
    .line 16
    sub-int/2addr v1, v2

    .line 17
    iput v1, v0, Lco/notix/bl;->d:I

    .line 18
    .line 19
    goto :goto_0

    .line 20
    :cond_0
    new-instance v0, Lco/notix/bl;

    .line 21
    .line 22
    invoke-direct {v0, p0, p1}, Lco/notix/bl;-><init>(Lco/notix/push/pull/PullWorker;LE7/d;)V

    .line 23
    .line 24
    .line 25
    :goto_0
    iget-object p1, v0, Lco/notix/bl;->b:Ljava/lang/Object;

    .line 26
    .line 27
    sget-object v1, LF7/a;->a:LF7/a;

    .line 28
    .line 29
    iget v2, v0, Lco/notix/bl;->d:I

    .line 30
    .line 31
    const/4 v3, 0x3

    .line 32
    const/4 v4, 0x2

    .line 33
    const/4 v5, 0x1

    .line 34
    if-eqz v2, :cond_4

    .line 35
    .line 36
    if-eq v2, v5, :cond_3

    .line 37
    .line 38
    if-eq v2, v4, :cond_2

    .line 39
    .line 40
    if-ne v2, v3, :cond_1

    .line 41
    .line 42
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 43
    .line 44
    .line 45
    goto :goto_5

    .line 46
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 47
    .line 48
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 49
    .line 50
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 51
    .line 52
    .line 53
    throw p1

    .line 54
    :cond_2
    iget-object v2, v0, Lco/notix/bl;->a:Lco/notix/push/pull/PullWorker;

    .line 55
    .line 56
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 57
    .line 58
    .line 59
    goto :goto_2

    .line 60
    :cond_3
    iget-object v2, v0, Lco/notix/bl;->a:Lco/notix/push/pull/PullWorker;

    .line 61
    .line 62
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 63
    .line 64
    .line 65
    goto :goto_1

    .line 66
    :cond_4
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 67
    .line 68
    .line 69
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 70
    .line 71
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 72
    .line 73
    .line 74
    iget-object p1, p1, Lco/notix/kd;->b:Lco/notix/x8;

    .line 75
    .line 76
    const-string v2, "PullWorker: doWork begin"

    .line 77
    .line 78
    invoke-virtual {p1, v2}, Lco/notix/x8;->b(Ljava/lang/String;)V

    .line 79
    .line 80
    .line 81
    iget-object p1, p0, Lco/notix/push/pull/PullWorker;->b:Lco/notix/l2;

    .line 82
    .line 83
    iput-object p0, v0, Lco/notix/bl;->a:Lco/notix/push/pull/PullWorker;

    .line 84
    .line 85
    iput v5, v0, Lco/notix/bl;->d:I

    .line 86
    .line 87
    invoke-virtual {p1, v0}, Lco/notix/l2;->f(LE7/d;)Ljava/lang/Object;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    if-ne p1, v1, :cond_5

    .line 92
    .line 93
    goto :goto_4

    .line 94
    :cond_5
    move-object v2, p0

    .line 95
    :goto_1
    iget-object p1, v2, Lco/notix/push/pull/PullWorker;->a:Lco/notix/df;

    .line 96
    .line 97
    iput-object v2, v0, Lco/notix/bl;->a:Lco/notix/push/pull/PullWorker;

    .line 98
    .line 99
    iput v4, v0, Lco/notix/bl;->d:I

    .line 100
    .line 101
    invoke-virtual {p1, v0}, Lco/notix/df;->a(LE7/d;)Ljava/lang/Object;

    .line 102
    .line 103
    .line 104
    move-result-object p1

    .line 105
    if-ne p1, v1, :cond_6

    .line 106
    .line 107
    goto :goto_4

    .line 108
    :cond_6
    :goto_2
    check-cast p1, Lco/notix/v8;

    .line 109
    .line 110
    sget-object v4, Lco/notix/v8;->a:Lco/notix/v8;

    .line 111
    .line 112
    if-ne p1, v4, :cond_9

    .line 113
    .line 114
    const/4 p1, 0x0

    .line 115
    iput-object p1, v0, Lco/notix/bl;->a:Lco/notix/push/pull/PullWorker;

    .line 116
    .line 117
    iput v3, v0, Lco/notix/bl;->d:I

    .line 118
    .line 119
    iget-object p1, v2, Lco/notix/push/pull/PullWorker;->c:Lco/notix/sk;

    .line 120
    .line 121
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 122
    .line 123
    .line 124
    move-result-wide v2

    .line 125
    invoke-virtual {p1, v2, v3, v0}, Lco/notix/sk;->a(JLE7/d;)Ljava/lang/Object;

    .line 126
    .line 127
    .line 128
    move-result-object p1

    .line 129
    if-ne p1, v1, :cond_7

    .line 130
    .line 131
    goto :goto_3

    .line 132
    :cond_7
    sget-object p1, LA7/n;->a:LA7/n;

    .line 133
    .line 134
    :goto_3
    if-ne p1, v1, :cond_8

    .line 135
    .line 136
    :goto_4
    return-object v1

    .line 137
    :cond_8
    :goto_5
    sget-object p1, Lco/notix/nr;->a:Lco/notix/nr;

    .line 138
    .line 139
    goto :goto_6

    .line 140
    :cond_9
    sget-object p1, Lco/notix/mr;->a:Lco/notix/mr;

    .line 141
    .line 142
    :goto_6
    sget-object v0, Lco/notix/md;->a:Lco/notix/kd;

    .line 143
    .line 144
    new-instance v1, Ljava/lang/StringBuilder;

    .line 145
    .line 146
    const-string v2, "PullWorker: doWork end. workerResult="

    .line 147
    .line 148
    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 149
    .line 150
    .line 151
    invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 152
    .line 153
    .line 154
    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 155
    .line 156
    .line 157
    move-result-object v1

    .line 158
    invoke-virtual {v0, v1}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 159
    .line 160
    .line 161
    return-object p1
    .line 162
    .line 163
    .line 164
    .line 165
    .line 166
    .line 167
    .line 168
    .line 169
    .line 170
    .line 171
    .line 172
    .line 173
    .line 174
    .line 175
    .line 176
    .line 177
    .line 178
    .line 179
    .line 180
    .line 181
    .line 182
    .line 183
    .line 184
    .line 185
    .line 186
    .line 187
    .line 188
    .line 189
    .line 190
    .line 191
    .line 192
    .line 193
    .line 194
    .line 195
    .line 196
    .line 197
    .line 198
    .line 199
    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    .line 205
    .line 206
    .line 207
    .line 208
    .line 209
    .line 210
    .line 211
    .line 212
    .line 213
    .line 214
    .line 215
    .line 216
    .line 217
    .line 218
    .line 219
    .line 220
    .line 221
    .line 222
    .line 223
    .line 224
    .line 225
    .line 226
    .line 227
    .line 228
    .line 229
    .line 230
    .line 231
    .line 232
    .line 233
    .line 234
    .line 235
    .line 236
    .line 237
    .line 238
    .line 239
    .line 240
.end method
