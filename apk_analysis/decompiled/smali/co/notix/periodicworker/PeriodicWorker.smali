.class public final Lco/notix/periodicworker/PeriodicWorker;
.super Lco/notix/worker/SelfRestartingWorker;
.source "SourceFile"


# instance fields
.field public final a:Lco/notix/jp;

.field public final b:Lco/notix/lm;

.field public final c:Lco/notix/xq;

.field public final d:LY7/z;

.field public final e:Lco/notix/l4;

.field public final f:Lco/notix/c8;

.field public final g:Lco/notix/ei;


# direct methods
.method public constructor <init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V
    .locals 1

    const-string v0, "appContext"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "params"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0, p1, p2}, Lco/notix/worker/SelfRestartingWorker;-><init>(Landroid/content/Context;Landroidx/work/WorkerParameters;)V

    invoke-static {}, Lco/notix/wq;->D()Lco/notix/jp;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->a:Lco/notix/jp;

    invoke-static {}, Lco/notix/wq;->C()Lco/notix/lm;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->b:Lco/notix/lm;

    invoke-static {}, Lco/notix/wq;->F()Lco/notix/xq;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->c:Lco/notix/xq;

    invoke-static {}, Lco/notix/wq;->f()Lco/notix/g9;

    move-result-object p1

    invoke-virtual {p1}, Lco/notix/g9;->b()LY7/z;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->d:LY7/z;

    invoke-static {}, Lco/notix/wq;->b()Lco/notix/l4;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->e:Lco/notix/l4;

    invoke-static {}, Lco/notix/wq;->d()Lco/notix/c8;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->f:Lco/notix/c8;

    invoke-static {}, Lco/notix/wq;->x()Lco/notix/ei;

    move-result-object p1

    iput-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->g:Lco/notix/ei;

    return-void
.end method


# virtual methods
.method public final a()Lco/notix/ap;
    .locals 1

    .line 6
    iget-object v0, p0, Lco/notix/periodicworker/PeriodicWorker;->g:Lco/notix/ei;

    return-object v0
.end method

.method public final a(LE7/d;)Ljava/lang/Object;
    .locals 4

    iget-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->c:Lco/notix/xq;

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 1
    sget-object p1, Lco/notix/wq;->b:Lco/notix/d9;

    .line 2
    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    move-result-object p1

    .line 3
    const-string v0, "NOTIX_PREF_STORAGE"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    move-result-object p1

    const-string v0, "NOTIX_PERIODIC_WORKER_RUN_COUNT"

    const-wide/16 v1, 0x0

    invoke-interface {p1, v0, v1, v2}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    move-result-wide v0

    const-wide/16 v2, 0x1

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const-wide/16 v0, 0x5

    goto :goto_0

    :cond_0
    const-wide/16 v2, 0x2

    cmp-long p1, v0, v2

    if-nez p1, :cond_1

    const-wide/16 v0, 0x14

    goto :goto_0

    :cond_1
    const-wide/16 v0, 0x3c

    .line 4
    :goto_0
    sget-object p1, Ljava/util/concurrent/TimeUnit;->MINUTES:Ljava/util/concurrent/TimeUnit;

    invoke-virtual {p1, v0, v1}, Ljava/util/concurrent/TimeUnit;->toMillis(J)J

    move-result-wide v0

    .line 5
    new-instance p1, Ljava/lang/Long;

    invoke-direct {p1, v0, v1}, Ljava/lang/Long;-><init>(J)V

    return-object p1
.end method

.method public final b(LE7/d;)Ljava/lang/Object;
    .locals 11

    .line 1
    const/4 v0, 0x3

    .line 2
    const/4 v1, 0x0

    .line 3
    const/4 v2, 0x1

    .line 4
    instance-of v3, p1, Lco/notix/fi;

    .line 5
    .line 6
    if-eqz v3, :cond_0

    .line 7
    .line 8
    move-object v3, p1

    .line 9
    check-cast v3, Lco/notix/fi;

    .line 10
    .line 11
    iget v4, v3, Lco/notix/fi;->c:I

    .line 12
    .line 13
    const/high16 v5, -0x80000000

    .line 14
    .line 15
    and-int v6, v4, v5

    .line 16
    .line 17
    if-eqz v6, :cond_0

    .line 18
    .line 19
    sub-int/2addr v4, v5

    .line 20
    iput v4, v3, Lco/notix/fi;->c:I

    .line 21
    .line 22
    goto :goto_0

    .line 23
    :cond_0
    new-instance v3, Lco/notix/fi;

    .line 24
    .line 25
    invoke-direct {v3, p0, p1}, Lco/notix/fi;-><init>(Lco/notix/periodicworker/PeriodicWorker;LE7/d;)V

    .line 26
    .line 27
    .line 28
    :goto_0
    iget-object p1, v3, Lco/notix/fi;->a:Ljava/lang/Object;

    .line 29
    .line 30
    sget-object v4, LF7/a;->a:LF7/a;

    .line 31
    .line 32
    iget v5, v3, Lco/notix/fi;->c:I

    .line 33
    .line 34
    if-eqz v5, :cond_2

    .line 35
    .line 36
    if-ne v5, v2, :cond_1

    .line 37
    .line 38
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 39
    .line 40
    .line 41
    goto/16 :goto_1

    .line 42
    .line 43
    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 44
    .line 45
    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    .line 46
    .line 47
    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    .line 48
    .line 49
    .line 50
    throw p1

    .line 51
    :cond_2
    invoke-static {p1}, La/a;->A(Ljava/lang/Object;)V

    .line 52
    .line 53
    .line 54
    iget-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->c:Lco/notix/xq;

    .line 55
    .line 56
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    sget-object p1, Lco/notix/wq;->b:Lco/notix/d9;

    .line 60
    .line 61
    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 62
    .line 63
    .line 64
    move-result-object v5

    .line 65
    const-string v6, "NOTIX_PREF_STORAGE"

    .line 66
    .line 67
    invoke-virtual {v5, v6, v1}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;

    .line 68
    .line 69
    .line 70
    move-result-object v5

    .line 71
    const-string v6, "NOTIX_PERIODIC_WORKER_RUN_COUNT"

    .line 72
    .line 73
    const-wide/16 v7, 0x0

    .line 74
    .line 75
    invoke-interface {v5, v6, v7, v8}, Landroid/content/SharedPreferences;->getLong(Ljava/lang/String;J)J

    .line 76
    .line 77
    .line 78
    move-result-wide v7

    .line 79
    iget-object v5, p0, Lco/notix/periodicworker/PeriodicWorker;->c:Lco/notix/xq;

    .line 80
    .line 81
    const-wide/16 v9, 0x1

    .line 82
    .line 83
    add-long/2addr v9, v7

    .line 84
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 85
    .line 86
    .line 87
    invoke-virtual {p1}, Lco/notix/d9;->a()Landroid/content/Context;

    .line 88
    .line 89
    .line 90
    move-result-object p1

    .line 91
    invoke-static {p1, v6, v9, v10}, Lco/notix/xq;->a(Landroid/content/Context;Ljava/lang/String;J)V

    .line 92
    .line 93
    .line 94
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 95
    .line 96
    new-instance v5, Ljava/lang/StringBuilder;

    .line 97
    .line 98
    const-string v6, "periodic worker: doWork begin. runCount="

    .line 99
    .line 100
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 101
    .line 102
    .line 103
    invoke-virtual {v5, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v5

    .line 110
    invoke-virtual {p1, v5}, Lco/notix/kd;->b(Ljava/lang/String;)V

    .line 111
    .line 112
    .line 113
    iget-object p1, p0, Lco/notix/periodicworker/PeriodicWorker;->d:LY7/z;

    .line 114
    .line 115
    new-instance v5, Lco/notix/gi;

    .line 116
    .line 117
    const/4 v6, 0x0

    .line 118
    invoke-direct {v5, p0, v6}, Lco/notix/gi;-><init>(Lco/notix/periodicworker/PeriodicWorker;LE7/d;)V

    .line 119
    .line 120
    .line 121
    invoke-static {p1, v6, v5, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 122
    .line 123
    .line 124
    move-result-object p1

    .line 125
    iget-object v5, p0, Lco/notix/periodicworker/PeriodicWorker;->d:LY7/z;

    .line 126
    .line 127
    new-instance v7, Lco/notix/hi;

    .line 128
    .line 129
    invoke-direct {v7, p0, v6}, Lco/notix/hi;-><init>(Lco/notix/periodicworker/PeriodicWorker;LE7/d;)V

    .line 130
    .line 131
    .line 132
    invoke-static {v5, v6, v7, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 133
    .line 134
    .line 135
    move-result-object v5

    .line 136
    iget-object v7, p0, Lco/notix/periodicworker/PeriodicWorker;->d:LY7/z;

    .line 137
    .line 138
    new-instance v8, Lco/notix/ii;

    .line 139
    .line 140
    invoke-direct {v8, p0, v6}, Lco/notix/ii;-><init>(Lco/notix/periodicworker/PeriodicWorker;LE7/d;)V

    .line 141
    .line 142
    .line 143
    invoke-static {v7, v6, v8, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 144
    .line 145
    .line 146
    move-result-object v7

    .line 147
    iget-object v8, p0, Lco/notix/periodicworker/PeriodicWorker;->d:LY7/z;

    .line 148
    .line 149
    new-instance v9, Lco/notix/ji;

    .line 150
    .line 151
    invoke-direct {v9, p0, v6}, Lco/notix/ji;-><init>(Lco/notix/periodicworker/PeriodicWorker;LE7/d;)V

    .line 152
    .line 153
    .line 154
    invoke-static {v8, v6, v9, v0}, LY7/B;->r(LY7/z;LE7/a;LO7/p;I)LY7/y0;

    .line 155
    .line 156
    .line 157
    move-result-object v6

    .line 158
    const/4 v8, 0x4

    .line 159
    new-array v8, v8, [LY7/h0;

    .line 160
    .line 161
    aput-object p1, v8, v1

    .line 162
    .line 163
    aput-object v5, v8, v2

    .line 164
    .line 165
    const/4 p1, 0x2

    .line 166
    aput-object v7, v8, p1

    .line 167
    .line 168
    aput-object v6, v8, v0

    .line 169
    .line 170
    invoke-static {v8}, LB7/l;->b0([Ljava/lang/Object;)Ljava/util/List;

    .line 171
    .line 172
    .line 173
    move-result-object p1

    .line 174
    iput v2, v3, Lco/notix/fi;->c:I

    .line 175
    .line 176
    invoke-static {p1, v3}, LY7/B;->q(Ljava/util/List;LG7/c;)Ljava/lang/Object;

    .line 177
    .line 178
    .line 179
    move-result-object p1

    .line 180
    if-ne p1, v4, :cond_3

    .line 181
    .line 182
    return-object v4

    .line 183
    :cond_3
    :goto_1
    sget-object p1, Lco/notix/md;->a:Lco/notix/kd;

    .line 184
    .line 185
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 186
    .line 187
    .line 188
    iget-object p1, p1, Lco/notix/kd;->b:Lco/notix/x8;

    .line 189
    .line 190
    const-string v0, "periodic worker: doWork ending..."

    .line 191
    .line 192
    invoke-virtual {p1, v0}, Lco/notix/x8;->b(Ljava/lang/String;)V

    .line 193
    .line 194
    .line 195
    sget-object p1, Lco/notix/nr;->a:Lco/notix/nr;

    .line 196
    .line 197
    return-object p1
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
