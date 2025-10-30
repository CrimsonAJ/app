.class public final Li1/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lf1/c;


# static fields
.field public static final e:Ljava/lang/String;


# instance fields
.field public final a:Landroid/content/Context;

.field public final b:Landroid/app/job/JobScheduler;

.field public final c:Lf1/k;

.field public final d:Li1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    .line 1
    const-string v0, "SystemJobScheduler"

    .line 2
    .line 3
    invoke-static {v0}, Le1/q;->j(Ljava/lang/String;)Ljava/lang/String;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    sput-object v0, Li1/b;->e:Ljava/lang/String;

    .line 8
    .line 9
    return-void
    .line 10
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
.end method

.method public constructor <init>(Landroid/content/Context;Lf1/k;)V
    .locals 2

    .line 1
    const-string v0, "jobscheduler"

    .line 2
    .line 3
    invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;

    .line 4
    .line 5
    .line 6
    move-result-object v0

    .line 7
    check-cast v0, Landroid/app/job/JobScheduler;

    .line 8
    .line 9
    new-instance v1, Li1/a;

    .line 10
    .line 11
    invoke-direct {v1, p1}, Li1/a;-><init>(Landroid/content/Context;)V

    .line 12
    .line 13
    .line 14
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 15
    .line 16
    .line 17
    iput-object p1, p0, Li1/b;->a:Landroid/content/Context;

    .line 18
    .line 19
    iput-object p2, p0, Li1/b;->c:Lf1/k;

    .line 20
    .line 21
    iput-object v0, p0, Li1/b;->b:Landroid/app/job/JobScheduler;

    .line 22
    .line 23
    iput-object v1, p0, Li1/b;->d:Li1/a;

    .line 24
    .line 25
    return-void
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
.end method

.method public static a(Landroid/app/job/JobScheduler;I)V
    .locals 5

    .line 1
    const/4 v0, 0x0

    .line 2
    const/4 v1, 0x1

    .line 3
    :try_start_0
    invoke-virtual {p0, p1}, Landroid/app/job/JobScheduler;->cancel(I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 4
    .line 5
    .line 6
    return-void

    .line 7
    :catchall_0
    move-exception p0

    .line 8
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 9
    .line 10
    .line 11
    move-result-object v2

    .line 12
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 13
    .line 14
    .line 15
    move-result-object v3

    .line 16
    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 17
    .line 18
    .line 19
    move-result-object p1

    .line 20
    new-array v4, v1, [Ljava/lang/Object;

    .line 21
    .line 22
    aput-object p1, v4, v0

    .line 23
    .line 24
    const-string p1, "Exception while trying to cancel job (%d)"

    .line 25
    .line 26
    invoke-static {v3, p1, v4}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 27
    .line 28
    .line 29
    move-result-object p1

    .line 30
    new-array v1, v1, [Ljava/lang/Throwable;

    .line 31
    .line 32
    aput-object p0, v1, v0

    .line 33
    .line 34
    sget-object p0, Li1/b;->e:Ljava/lang/String;

    .line 35
    .line 36
    invoke-virtual {v2, p0, p1, v1}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 37
    .line 38
    .line 39
    return-void
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
.end method

.method public static c(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/ArrayList;
    .locals 7

    .line 1
    invoke-static {p0, p1}, Li1/b;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 2
    .line 3
    .line 4
    move-result-object p0

    .line 5
    const/4 p1, 0x0

    .line 6
    if-nez p0, :cond_0

    .line 7
    .line 8
    return-object p1

    .line 9
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 10
    .line 11
    const/4 v1, 0x2

    .line 12
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 13
    .line 14
    .line 15
    invoke-virtual {p0}, Ljava/util/ArrayList;->size()I

    .line 16
    .line 17
    .line 18
    move-result v1

    .line 19
    const/4 v2, 0x0

    .line 20
    :cond_1
    :goto_0
    if-ge v2, v1, :cond_3

    .line 21
    .line 22
    invoke-virtual {p0, v2}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 23
    .line 24
    .line 25
    move-result-object v3

    .line 26
    add-int/lit8 v2, v2, 0x1

    .line 27
    .line 28
    check-cast v3, Landroid/app/job/JobInfo;

    .line 29
    .line 30
    const-string v4, "EXTRA_WORK_SPEC_ID"

    .line 31
    .line 32
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getExtras()Landroid/os/PersistableBundle;

    .line 33
    .line 34
    .line 35
    move-result-object v5

    .line 36
    if-eqz v5, :cond_2

    .line 37
    .line 38
    :try_start_0
    invoke-virtual {v5, v4}, Landroid/os/BaseBundle;->containsKey(Ljava/lang/String;)Z

    .line 39
    .line 40
    .line 41
    move-result v6

    .line 42
    if-eqz v6, :cond_2

    .line 43
    .line 44
    invoke-virtual {v5, v4}, Landroid/os/BaseBundle;->getString(Ljava/lang/String;)Ljava/lang/String;

    .line 45
    .line 46
    .line 47
    move-result-object v4
    :try_end_0
    .catch Ljava/lang/NullPointerException; {:try_start_0 .. :try_end_0} :catch_0

    .line 48
    goto :goto_1

    .line 49
    :catch_0
    :cond_2
    move-object v4, p1

    .line 50
    :goto_1
    invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 51
    .line 52
    .line 53
    move-result v4

    .line 54
    if-eqz v4, :cond_1

    .line 55
    .line 56
    invoke-virtual {v3}, Landroid/app/job/JobInfo;->getId()I

    .line 57
    .line 58
    .line 59
    move-result v3

    .line 60
    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 61
    .line 62
    .line 63
    move-result-object v3

    .line 64
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 65
    .line 66
    .line 67
    goto :goto_0

    .line 68
    :cond_3
    return-object v0
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

.method public static e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;
    .locals 4

    .line 1
    const/4 v0, 0x0

    .line 2
    :try_start_0
    invoke-virtual {p1}, Landroid/app/job/JobScheduler;->getAllPendingJobs()Ljava/util/List;

    .line 3
    .line 4
    .line 5
    move-result-object p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 6
    goto :goto_0

    .line 7
    :catchall_0
    move-exception p1

    .line 8
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 9
    .line 10
    .line 11
    move-result-object v1

    .line 12
    const/4 v2, 0x1

    .line 13
    new-array v2, v2, [Ljava/lang/Throwable;

    .line 14
    .line 15
    const/4 v3, 0x0

    .line 16
    aput-object p1, v2, v3

    .line 17
    .line 18
    sget-object p1, Li1/b;->e:Ljava/lang/String;

    .line 19
    .line 20
    const-string v3, "getAllPendingJobs() is not reliable on this device."

    .line 21
    .line 22
    invoke-virtual {v1, p1, v3, v2}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 23
    .line 24
    .line 25
    move-object p1, v0

    .line 26
    :goto_0
    if-nez p1, :cond_0

    .line 27
    .line 28
    return-object v0

    .line 29
    :cond_0
    new-instance v0, Ljava/util/ArrayList;

    .line 30
    .line 31
    invoke-interface {p1}, Ljava/util/List;->size()I

    .line 32
    .line 33
    .line 34
    move-result v1

    .line 35
    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    .line 36
    .line 37
    .line 38
    new-instance v1, Landroid/content/ComponentName;

    .line 39
    .line 40
    const-class v2, Landroidx/work/impl/background/systemjob/SystemJobService;

    .line 41
    .line 42
    invoke-direct {v1, p0, v2}, Landroid/content/ComponentName;-><init>(Landroid/content/Context;Ljava/lang/Class;)V

    .line 43
    .line 44
    .line 45
    invoke-interface {p1}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    .line 46
    .line 47
    .line 48
    move-result-object p0

    .line 49
    :cond_1
    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    .line 50
    .line 51
    .line 52
    move-result p1

    .line 53
    if-eqz p1, :cond_2

    .line 54
    .line 55
    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 56
    .line 57
    .line 58
    move-result-object p1

    .line 59
    check-cast p1, Landroid/app/job/JobInfo;

    .line 60
    .line 61
    invoke-virtual {p1}, Landroid/app/job/JobInfo;->getService()Landroid/content/ComponentName;

    .line 62
    .line 63
    .line 64
    move-result-object v2

    .line 65
    invoke-virtual {v1, v2}, Landroid/content/ComponentName;->equals(Ljava/lang/Object;)Z

    .line 66
    .line 67
    .line 68
    move-result v2

    .line 69
    if-eqz v2, :cond_1

    .line 70
    .line 71
    invoke-virtual {v0, p1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    .line 72
    .line 73
    .line 74
    goto :goto_1

    .line 75
    :cond_2
    return-object v0
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
    .line 137
    .line 138
    .line 139
    .line 140
    .line 141
    .line 142
    .line 143
    .line 144
    .line 145
    .line 146
    .line 147
    .line 148
    .line 149
    .line 150
    .line 151
    .line 152
    .line 153
    .line 154
    .line 155
    .line 156
    .line 157
    .line 158
    .line 159
    .line 160
    .line 161
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
.end method


# virtual methods
.method public final b(Ljava/lang/String;)V
    .locals 5

    .line 1
    iget-object v0, p0, Li1/b;->a:Landroid/content/Context;

    .line 2
    .line 3
    iget-object v1, p0, Li1/b;->b:Landroid/app/job/JobScheduler;

    .line 4
    .line 5
    invoke-static {v0, v1, p1}, Li1/b;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 6
    .line 7
    .line 8
    move-result-object v0

    .line 9
    if-eqz v0, :cond_1

    .line 10
    .line 11
    invoke-virtual {v0}, Ljava/util/ArrayList;->isEmpty()Z

    .line 12
    .line 13
    .line 14
    move-result v2

    .line 15
    if-nez v2, :cond_1

    .line 16
    .line 17
    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    .line 18
    .line 19
    .line 20
    move-result v2

    .line 21
    const/4 v3, 0x0

    .line 22
    :goto_0
    if-ge v3, v2, :cond_0

    .line 23
    .line 24
    invoke-virtual {v0, v3}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 25
    .line 26
    .line 27
    move-result-object v4

    .line 28
    add-int/lit8 v3, v3, 0x1

    .line 29
    .line 30
    check-cast v4, Ljava/lang/Integer;

    .line 31
    .line 32
    invoke-virtual {v4}, Ljava/lang/Integer;->intValue()I

    .line 33
    .line 34
    .line 35
    move-result v4

    .line 36
    invoke-static {v1, v4}, Li1/b;->a(Landroid/app/job/JobScheduler;I)V

    .line 37
    .line 38
    .line 39
    goto :goto_0

    .line 40
    :cond_0
    iget-object v0, p0, Li1/b;->c:Lf1/k;

    .line 41
    .line 42
    iget-object v0, v0, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 43
    .line 44
    invoke-virtual {v0}, Landroidx/work/impl/WorkDatabase;->s()Lb5/G1;

    .line 45
    .line 46
    .line 47
    move-result-object v0

    .line 48
    invoke-virtual {v0, p1}, Lb5/G1;->z(Ljava/lang/String;)V

    .line 49
    .line 50
    .line 51
    :cond_1
    return-void
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
.end method

.method public final varargs d([Ln1/j;)V
    .locals 11

    .line 1
    iget-object v0, p0, Li1/b;->c:Lf1/k;

    .line 2
    .line 3
    iget-object v1, v0, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 4
    .line 5
    new-instance v2, Lo1/f;

    .line 6
    .line 7
    const/4 v3, 0x0

    .line 8
    invoke-direct {v2, v3, v1}, Lo1/f;-><init>(ILjava/lang/Object;)V

    .line 9
    .line 10
    .line 11
    array-length v3, p1

    .line 12
    const/4 v4, 0x0

    .line 13
    move v5, v4

    .line 14
    :goto_0
    if-ge v5, v3, :cond_7

    .line 15
    .line 16
    aget-object v6, p1, v5

    .line 17
    .line 18
    invoke-virtual {v1}, LG0/E;->c()V

    .line 19
    .line 20
    .line 21
    :try_start_0
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 22
    .line 23
    .line 24
    move-result-object v7

    .line 25
    iget-object v8, v6, Ln1/j;->a:Ljava/lang/String;

    .line 26
    .line 27
    invoke-virtual {v7, v8}, LG6/e;->l(Ljava/lang/String;)Ln1/j;

    .line 28
    .line 29
    .line 30
    move-result-object v7
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 31
    const-string v8, "Skipping scheduling "

    .line 32
    .line 33
    sget-object v9, Li1/b;->e:Ljava/lang/String;

    .line 34
    .line 35
    if-nez v7, :cond_0

    .line 36
    .line 37
    :try_start_1
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 38
    .line 39
    .line 40
    move-result-object v7

    .line 41
    new-instance v10, Ljava/lang/StringBuilder;

    .line 42
    .line 43
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 44
    .line 45
    .line 46
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 47
    .line 48
    .line 49
    iget-object v6, v6, Ln1/j;->a:Ljava/lang/String;

    .line 50
    .line 51
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 52
    .line 53
    .line 54
    const-string v6, " because it\'s no longer in the DB"

    .line 55
    .line 56
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 57
    .line 58
    .line 59
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 60
    .line 61
    .line 62
    move-result-object v6

    .line 63
    new-array v8, v4, [Ljava/lang/Throwable;

    .line 64
    .line 65
    invoke-virtual {v7, v9, v6, v8}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 66
    .line 67
    .line 68
    invoke-virtual {v1}, LG0/E;->p()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 69
    .line 70
    .line 71
    :goto_1
    invoke-virtual {v1}, LG0/E;->m()V

    .line 72
    .line 73
    .line 74
    goto/16 :goto_4

    .line 75
    .line 76
    :catchall_0
    move-exception p1

    .line 77
    goto/16 :goto_5

    .line 78
    .line 79
    :cond_0
    :try_start_2
    iget v7, v7, Ln1/j;->b:I

    .line 80
    .line 81
    const/4 v10, 0x1

    .line 82
    if-eq v7, v10, :cond_1

    .line 83
    .line 84
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 85
    .line 86
    .line 87
    move-result-object v7

    .line 88
    new-instance v10, Ljava/lang/StringBuilder;

    .line 89
    .line 90
    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    .line 91
    .line 92
    .line 93
    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 94
    .line 95
    .line 96
    iget-object v6, v6, Ln1/j;->a:Ljava/lang/String;

    .line 97
    .line 98
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 99
    .line 100
    .line 101
    const-string v6, " because it is no longer enqueued"

    .line 102
    .line 103
    invoke-virtual {v10, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 104
    .line 105
    .line 106
    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 107
    .line 108
    .line 109
    move-result-object v6

    .line 110
    new-array v8, v4, [Ljava/lang/Throwable;

    .line 111
    .line 112
    invoke-virtual {v7, v9, v6, v8}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 113
    .line 114
    .line 115
    invoke-virtual {v1}, LG0/E;->p()V

    .line 116
    .line 117
    .line 118
    goto :goto_1

    .line 119
    :cond_1
    invoke-virtual {v1}, Landroidx/work/impl/WorkDatabase;->s()Lb5/G1;

    .line 120
    .line 121
    .line 122
    move-result-object v7

    .line 123
    iget-object v8, v6, Ln1/j;->a:Ljava/lang/String;

    .line 124
    .line 125
    invoke-virtual {v7, v8}, Lb5/G1;->r(Ljava/lang/String;)Ln1/d;

    .line 126
    .line 127
    .line 128
    move-result-object v7

    .line 129
    if-eqz v7, :cond_2

    .line 130
    .line 131
    iget v8, v7, Ln1/d;->b:I

    .line 132
    .line 133
    goto :goto_2

    .line 134
    :cond_2
    iget-object v8, v0, Lf1/k;->i:Le1/b;

    .line 135
    .line 136
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 137
    .line 138
    .line 139
    iget-object v8, v0, Lf1/k;->i:Le1/b;

    .line 140
    .line 141
    iget v8, v8, Le1/b;->g:I

    .line 142
    .line 143
    invoke-virtual {v2, v8}, Lo1/f;->G(I)I

    .line 144
    .line 145
    .line 146
    move-result v8

    .line 147
    :goto_2
    if-nez v7, :cond_3

    .line 148
    .line 149
    new-instance v7, Ln1/d;

    .line 150
    .line 151
    iget-object v9, v6, Ln1/j;->a:Ljava/lang/String;

    .line 152
    .line 153
    invoke-direct {v7, v9, v8}, Ln1/d;-><init>(Ljava/lang/String;I)V

    .line 154
    .line 155
    .line 156
    iget-object v9, v0, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 157
    .line 158
    invoke-virtual {v9}, Landroidx/work/impl/WorkDatabase;->s()Lb5/G1;

    .line 159
    .line 160
    .line 161
    move-result-object v9

    .line 162
    invoke-virtual {v9, v7}, Lb5/G1;->u(Ln1/d;)V

    .line 163
    .line 164
    .line 165
    :cond_3
    invoke-virtual {p0, v6, v8}, Li1/b;->g(Ln1/j;I)V

    .line 166
    .line 167
    .line 168
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 169
    .line 170
    const/16 v9, 0x17

    .line 171
    .line 172
    if-ne v7, v9, :cond_6

    .line 173
    .line 174
    iget-object v7, p0, Li1/b;->a:Landroid/content/Context;

    .line 175
    .line 176
    iget-object v9, p0, Li1/b;->b:Landroid/app/job/JobScheduler;

    .line 177
    .line 178
    iget-object v10, v6, Ln1/j;->a:Ljava/lang/String;

    .line 179
    .line 180
    invoke-static {v7, v9, v10}, Li1/b;->c(Landroid/content/Context;Landroid/app/job/JobScheduler;Ljava/lang/String;)Ljava/util/ArrayList;

    .line 181
    .line 182
    .line 183
    move-result-object v7

    .line 184
    if-eqz v7, :cond_6

    .line 185
    .line 186
    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 187
    .line 188
    .line 189
    move-result-object v8

    .line 190
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->indexOf(Ljava/lang/Object;)I

    .line 191
    .line 192
    .line 193
    move-result v8

    .line 194
    if-ltz v8, :cond_4

    .line 195
    .line 196
    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->remove(I)Ljava/lang/Object;

    .line 197
    .line 198
    .line 199
    :cond_4
    invoke-virtual {v7}, Ljava/util/ArrayList;->isEmpty()Z

    .line 200
    .line 201
    .line 202
    move-result v8

    .line 203
    if-nez v8, :cond_5

    .line 204
    .line 205
    invoke-virtual {v7, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    .line 206
    .line 207
    .line 208
    move-result-object v7

    .line 209
    check-cast v7, Ljava/lang/Integer;

    .line 210
    .line 211
    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    .line 212
    .line 213
    .line 214
    move-result v7

    .line 215
    goto :goto_3

    .line 216
    :cond_5
    iget-object v7, v0, Lf1/k;->i:Le1/b;

    .line 217
    .line 218
    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 219
    .line 220
    .line 221
    iget-object v7, v0, Lf1/k;->i:Le1/b;

    .line 222
    .line 223
    iget v7, v7, Le1/b;->g:I

    .line 224
    .line 225
    invoke-virtual {v2, v7}, Lo1/f;->G(I)I

    .line 226
    .line 227
    .line 228
    move-result v7

    .line 229
    :goto_3
    invoke-virtual {p0, v6, v7}, Li1/b;->g(Ln1/j;I)V

    .line 230
    .line 231
    .line 232
    :cond_6
    invoke-virtual {v1}, LG0/E;->p()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    .line 233
    .line 234
    .line 235
    goto/16 :goto_1

    .line 236
    .line 237
    :goto_4
    add-int/lit8 v5, v5, 0x1

    .line 238
    .line 239
    goto/16 :goto_0

    .line 240
    .line 241
    :goto_5
    invoke-virtual {v1}, LG0/E;->m()V

    .line 242
    .line 243
    .line 244
    throw p1

    .line 245
    :cond_7
    return-void
    .line 246
    .line 247
    .line 248
    .line 249
    .line 250
    .line 251
    .line 252
    .line 253
    .line 254
    .line 255
    .line 256
    .line 257
    .line 258
    .line 259
    .line 260
    .line 261
    .line 262
    .line 263
    .line 264
    .line 265
    .line 266
    .line 267
    .line 268
    .line 269
    .line 270
    .line 271
    .line 272
    .line 273
    .line 274
    .line 275
    .line 276
    .line 277
    .line 278
    .line 279
    .line 280
    .line 281
    .line 282
    .line 283
    .line 284
    .line 285
    .line 286
    .line 287
    .line 288
    .line 289
    .line 290
    .line 291
    .line 292
    .line 293
    .line 294
    .line 295
    .line 296
    .line 297
    .line 298
    .line 299
    .line 300
    .line 301
    .line 302
    .line 303
    .line 304
    .line 305
    .line 306
    .line 307
    .line 308
    .line 309
    .line 310
    .line 311
    .line 312
    .line 313
    .line 314
    .line 315
    .line 316
    .line 317
    .line 318
    .line 319
    .line 320
    .line 321
    .line 322
    .line 323
    .line 324
    .line 325
    .line 326
    .line 327
    .line 328
    .line 329
    .line 330
    .line 331
    .line 332
    .line 333
    .line 334
    .line 335
    .line 336
    .line 337
    .line 338
    .line 339
    .line 340
    .line 341
    .line 342
    .line 343
    .line 344
    .line 345
    .line 346
    .line 347
    .line 348
    .line 349
    .line 350
    .line 351
    .line 352
    .line 353
    .line 354
    .line 355
    .line 356
    .line 357
    .line 358
    .line 359
    .line 360
    .line 361
    .line 362
    .line 363
    .line 364
    .line 365
    .line 366
    .line 367
    .line 368
    .line 369
    .line 370
    .line 371
    .line 372
    .line 373
    .line 374
    .line 375
    .line 376
    .line 377
    .line 378
    .line 379
    .line 380
    .line 381
    .line 382
    .line 383
    .line 384
    .line 385
    .line 386
    .line 387
    .line 388
    .line 389
    .line 390
    .line 391
    .line 392
    .line 393
    .line 394
    .line 395
    .line 396
    .line 397
    .line 398
    .line 399
    .line 400
    .line 401
    .line 402
    .line 403
    .line 404
    .line 405
    .line 406
    .line 407
    .line 408
    .line 409
    .line 410
    .line 411
    .line 412
    .line 413
    .line 414
    .line 415
    .line 416
    .line 417
    .line 418
    .line 419
    .line 420
    .line 421
    .line 422
    .line 423
    .line 424
    .line 425
    .line 426
    .line 427
    .line 428
    .line 429
    .line 430
    .line 431
    .line 432
    .line 433
    .line 434
    .line 435
    .line 436
    .line 437
    .line 438
    .line 439
    .line 440
    .line 441
    .line 442
    .line 443
    .line 444
    .line 445
    .line 446
    .line 447
    .line 448
    .line 449
    .line 450
    .line 451
    .line 452
    .line 453
    .line 454
    .line 455
    .line 456
    .line 457
    .line 458
    .line 459
    .line 460
    .line 461
    .line 462
    .line 463
    .line 464
    .line 465
    .line 466
    .line 467
    .line 468
    .line 469
    .line 470
    .line 471
    .line 472
    .line 473
    .line 474
    .line 475
    .line 476
    .line 477
    .line 478
    .line 479
    .line 480
    .line 481
    .line 482
    .line 483
    .line 484
    .line 485
    .line 486
    .line 487
    .line 488
    .line 489
    .line 490
    .line 491
    .line 492
    .line 493
    .line 494
    .line 495
    .line 496
    .line 497
    .line 498
    .line 499
    .line 500
    .line 501
    .line 502
    .line 503
    .line 504
    .line 505
    .line 506
    .line 507
    .line 508
    .line 509
    .line 510
    .line 511
    .line 512
    .line 513
    .line 514
    .line 515
    .line 516
    .line 517
    .line 518
    .line 519
    .line 520
    .line 521
    .line 522
    .line 523
    .line 524
    .line 525
    .line 526
    .line 527
    .line 528
    .line 529
    .line 530
    .line 531
    .line 532
    .line 533
    .line 534
    .line 535
    .line 536
    .line 537
    .line 538
    .line 539
    .line 540
    .line 541
    .line 542
    .line 543
    .line 544
    .line 545
    .line 546
    .line 547
    .line 548
    .line 549
    .line 550
    .line 551
    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    .line 557
    .line 558
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
.end method

.method public final f()Z
    .locals 1

    .line 1
    const/4 v0, 0x1

    .line 2
    return v0
    .line 3
    .line 4
    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    .line 10
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
.end method

.method public final g(Ln1/j;I)V
    .locals 18

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-object/from16 v2, p1

    .line 4
    .line 5
    move/from16 v0, p2

    .line 6
    .line 7
    const/4 v3, 0x3

    .line 8
    const/4 v4, 0x0

    .line 9
    const/4 v5, 0x2

    .line 10
    const/4 v6, 0x1

    .line 11
    iget-object v7, v1, Li1/b;->b:Landroid/app/job/JobScheduler;

    .line 12
    .line 13
    iget-object v8, v1, Li1/b;->d:Li1/a;

    .line 14
    .line 15
    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    iget-object v9, v2, Ln1/j;->j:Le1/c;

    .line 19
    .line 20
    new-instance v10, Landroid/os/PersistableBundle;

    .line 21
    .line 22
    invoke-direct {v10}, Landroid/os/PersistableBundle;-><init>()V

    .line 23
    .line 24
    .line 25
    const-string v11, "EXTRA_WORK_SPEC_ID"

    .line 26
    .line 27
    iget-object v12, v2, Ln1/j;->a:Ljava/lang/String;

    .line 28
    .line 29
    invoke-virtual {v10, v11, v12}, Landroid/os/BaseBundle;->putString(Ljava/lang/String;Ljava/lang/String;)V

    .line 30
    .line 31
    .line 32
    const-string v11, "EXTRA_IS_PERIODIC"

    .line 33
    .line 34
    invoke-virtual {v2}, Ln1/j;->c()Z

    .line 35
    .line 36
    .line 37
    move-result v12

    .line 38
    invoke-virtual {v10, v11, v12}, Landroid/os/BaseBundle;->putBoolean(Ljava/lang/String;Z)V

    .line 39
    .line 40
    .line 41
    new-instance v11, Landroid/app/job/JobInfo$Builder;

    .line 42
    .line 43
    iget-object v8, v8, Li1/a;->a:Landroid/content/ComponentName;

    .line 44
    .line 45
    invoke-direct {v11, v0, v8}, Landroid/app/job/JobInfo$Builder;-><init>(ILandroid/content/ComponentName;)V

    .line 46
    .line 47
    .line 48
    iget-boolean v8, v9, Le1/c;->b:Z

    .line 49
    .line 50
    invoke-virtual {v11, v8}, Landroid/app/job/JobInfo$Builder;->setRequiresCharging(Z)Landroid/app/job/JobInfo$Builder;

    .line 51
    .line 52
    .line 53
    move-result-object v8

    .line 54
    iget-boolean v11, v9, Le1/c;->c:Z

    .line 55
    .line 56
    invoke-virtual {v8, v11}, Landroid/app/job/JobInfo$Builder;->setRequiresDeviceIdle(Z)Landroid/app/job/JobInfo$Builder;

    .line 57
    .line 58
    .line 59
    move-result-object v8

    .line 60
    invoke-virtual {v8, v10}, Landroid/app/job/JobInfo$Builder;->setExtras(Landroid/os/PersistableBundle;)Landroid/app/job/JobInfo$Builder;

    .line 61
    .line 62
    .line 63
    move-result-object v8

    .line 64
    iget v10, v9, Le1/c;->a:I

    .line 65
    .line 66
    sget v11, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 67
    .line 68
    const/16 v12, 0x1e

    .line 69
    .line 70
    const/16 v13, 0x18

    .line 71
    .line 72
    const/16 v14, 0x1a

    .line 73
    .line 74
    if-lt v11, v12, :cond_0

    .line 75
    .line 76
    const/4 v12, 0x6

    .line 77
    if-ne v10, v12, :cond_0

    .line 78
    .line 79
    new-instance v10, Landroid/net/NetworkRequest$Builder;

    .line 80
    .line 81
    invoke-direct {v10}, Landroid/net/NetworkRequest$Builder;-><init>()V

    .line 82
    .line 83
    .line 84
    const/16 v12, 0x19

    .line 85
    .line 86
    invoke-virtual {v10, v12}, Landroid/net/NetworkRequest$Builder;->addCapability(I)Landroid/net/NetworkRequest$Builder;

    .line 87
    .line 88
    .line 89
    move-result-object v10

    .line 90
    invoke-virtual {v10}, Landroid/net/NetworkRequest$Builder;->build()Landroid/net/NetworkRequest;

    .line 91
    .line 92
    .line 93
    move-result-object v10

    .line 94
    invoke-static {v8, v10}, LC5/f;->u(Landroid/app/job/JobInfo$Builder;Landroid/net/NetworkRequest;)V

    .line 95
    .line 96
    .line 97
    goto :goto_2

    .line 98
    :cond_0
    invoke-static {v10}, Lw/h;->b(I)I

    .line 99
    .line 100
    .line 101
    move-result v12

    .line 102
    if-eqz v12, :cond_6

    .line 103
    .line 104
    if-eq v12, v6, :cond_4

    .line 105
    .line 106
    if-eq v12, v5, :cond_5

    .line 107
    .line 108
    if-eq v12, v3, :cond_2

    .line 109
    .line 110
    const/4 v15, 0x4

    .line 111
    if-eq v12, v15, :cond_1

    .line 112
    .line 113
    goto :goto_0

    .line 114
    :cond_1
    if-lt v11, v14, :cond_3

    .line 115
    .line 116
    goto :goto_1

    .line 117
    :cond_2
    if-lt v11, v13, :cond_3

    .line 118
    .line 119
    move v15, v3

    .line 120
    goto :goto_1

    .line 121
    :cond_3
    :goto_0
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 122
    .line 123
    .line 124
    move-result-object v12

    .line 125
    invoke-static {v10}, Lcom/google/android/gms/internal/measurement/k1;->z(I)Ljava/lang/String;

    .line 126
    .line 127
    .line 128
    move-result-object v10

    .line 129
    const-string v15, "API version too low. Cannot convert network type value "

    .line 130
    .line 131
    invoke-virtual {v15, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    .line 132
    .line 133
    .line 134
    move-result-object v10

    .line 135
    new-array v15, v4, [Ljava/lang/Throwable;

    .line 136
    .line 137
    sget-object v3, Li1/a;->b:Ljava/lang/String;

    .line 138
    .line 139
    invoke-virtual {v12, v3, v10, v15}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 140
    .line 141
    .line 142
    :cond_4
    move v15, v6

    .line 143
    goto :goto_1

    .line 144
    :cond_5
    move v15, v5

    .line 145
    goto :goto_1

    .line 146
    :cond_6
    move v15, v4

    .line 147
    :goto_1
    invoke-virtual {v8, v15}, Landroid/app/job/JobInfo$Builder;->setRequiredNetworkType(I)Landroid/app/job/JobInfo$Builder;

    .line 148
    .line 149
    .line 150
    :goto_2
    iget-boolean v3, v9, Le1/c;->c:Z

    .line 151
    .line 152
    if-nez v3, :cond_8

    .line 153
    .line 154
    iget v3, v2, Ln1/j;->l:I

    .line 155
    .line 156
    if-ne v3, v5, :cond_7

    .line 157
    .line 158
    move v3, v4

    .line 159
    :goto_3
    move v10, v5

    .line 160
    goto :goto_4

    .line 161
    :cond_7
    move v3, v6

    .line 162
    goto :goto_3

    .line 163
    :goto_4
    iget-wide v5, v2, Ln1/j;->m:J

    .line 164
    .line 165
    invoke-virtual {v8, v5, v6, v3}, Landroid/app/job/JobInfo$Builder;->setBackoffCriteria(JI)Landroid/app/job/JobInfo$Builder;

    .line 166
    .line 167
    .line 168
    goto :goto_5

    .line 169
    :cond_8
    move v10, v5

    .line 170
    :goto_5
    invoke-virtual {v2}, Ln1/j;->a()J

    .line 171
    .line 172
    .line 173
    move-result-wide v5

    .line 174
    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    .line 175
    .line 176
    .line 177
    move-result-wide v16

    .line 178
    sub-long v5, v5, v16

    .line 179
    .line 180
    const-wide/16 v14, 0x0

    .line 181
    .line 182
    invoke-static {v5, v6, v14, v15}, Ljava/lang/Math;->max(JJ)J

    .line 183
    .line 184
    .line 185
    move-result-wide v5

    .line 186
    const/16 v3, 0x1c

    .line 187
    .line 188
    if-gt v11, v3, :cond_9

    .line 189
    .line 190
    invoke-virtual {v8, v5, v6}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 191
    .line 192
    .line 193
    goto :goto_6

    .line 194
    :cond_9
    cmp-long v3, v5, v14

    .line 195
    .line 196
    if-lez v3, :cond_a

    .line 197
    .line 198
    invoke-virtual {v8, v5, v6}, Landroid/app/job/JobInfo$Builder;->setMinimumLatency(J)Landroid/app/job/JobInfo$Builder;

    .line 199
    .line 200
    .line 201
    goto :goto_6

    .line 202
    :cond_a
    iget-boolean v3, v2, Ln1/j;->q:Z

    .line 203
    .line 204
    if-nez v3, :cond_b

    .line 205
    .line 206
    invoke-static {v8}, LC5/f;->t(Landroid/app/job/JobInfo$Builder;)V

    .line 207
    .line 208
    .line 209
    :cond_b
    :goto_6
    if-lt v11, v13, :cond_d

    .line 210
    .line 211
    iget-object v3, v9, Le1/c;->h:Le1/e;

    .line 212
    .line 213
    iget-object v3, v3, Le1/e;->a:Ljava/util/HashSet;

    .line 214
    .line 215
    invoke-virtual {v3}, Ljava/util/HashSet;->size()I

    .line 216
    .line 217
    .line 218
    move-result v3

    .line 219
    if-lez v3, :cond_d

    .line 220
    .line 221
    iget-object v3, v9, Le1/c;->h:Le1/e;

    .line 222
    .line 223
    iget-object v3, v3, Le1/e;->a:Ljava/util/HashSet;

    .line 224
    .line 225
    invoke-virtual {v3}, Ljava/util/HashSet;->iterator()Ljava/util/Iterator;

    .line 226
    .line 227
    .line 228
    move-result-object v3

    .line 229
    :goto_7
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    .line 230
    .line 231
    .line 232
    move-result v11

    .line 233
    if-eqz v11, :cond_c

    .line 234
    .line 235
    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 236
    .line 237
    .line 238
    move-result-object v11

    .line 239
    check-cast v11, Le1/d;

    .line 240
    .line 241
    iget-boolean v13, v11, Le1/d;->b:Z

    .line 242
    .line 243
    invoke-static {}, Lcom/google/android/material/datepicker/u;->l()V

    .line 244
    .line 245
    .line 246
    iget-object v11, v11, Le1/d;->a:Landroid/net/Uri;

    .line 247
    .line 248
    invoke-static {v11, v13}, Lcom/google/android/material/datepicker/u;->b(Landroid/net/Uri;I)Landroid/app/job/JobInfo$TriggerContentUri;

    .line 249
    .line 250
    .line 251
    move-result-object v11

    .line 252
    invoke-static {v8, v11}, Lcom/google/android/material/datepicker/u;->n(Landroid/app/job/JobInfo$Builder;Landroid/app/job/JobInfo$TriggerContentUri;)V

    .line 253
    .line 254
    .line 255
    goto :goto_7

    .line 256
    :cond_c
    move v13, v10

    .line 257
    iget-wide v10, v9, Le1/c;->f:J

    .line 258
    .line 259
    invoke-static {v8, v10, v11}, Lcom/google/android/material/datepicker/u;->m(Landroid/app/job/JobInfo$Builder;J)V

    .line 260
    .line 261
    .line 262
    iget-wide v10, v9, Le1/c;->g:J

    .line 263
    .line 264
    invoke-static {v8, v10, v11}, Lcom/google/android/material/datepicker/u;->D(Landroid/app/job/JobInfo$Builder;J)V

    .line 265
    .line 266
    .line 267
    goto :goto_8

    .line 268
    :cond_d
    move v13, v10

    .line 269
    :goto_8
    invoke-virtual {v8, v4}, Landroid/app/job/JobInfo$Builder;->setPersisted(Z)Landroid/app/job/JobInfo$Builder;

    .line 270
    .line 271
    .line 272
    sget v3, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 273
    .line 274
    const/16 v10, 0x1a

    .line 275
    .line 276
    if-lt v3, v10, :cond_e

    .line 277
    .line 278
    iget-boolean v3, v9, Le1/c;->d:Z

    .line 279
    .line 280
    invoke-static {v8, v3}, Lcom/google/firebase/messaging/e;->s(Landroid/app/job/JobInfo$Builder;Z)V

    .line 281
    .line 282
    .line 283
    iget-boolean v3, v9, Le1/c;->e:Z

    .line 284
    .line 285
    invoke-static {v8, v3}, Lcom/google/firebase/messaging/e;->D(Landroid/app/job/JobInfo$Builder;Z)V

    .line 286
    .line 287
    .line 288
    :cond_e
    iget v3, v2, Ln1/j;->k:I

    .line 289
    .line 290
    if-lez v3, :cond_f

    .line 291
    .line 292
    const/4 v3, 0x1

    .line 293
    goto :goto_9

    .line 294
    :cond_f
    move v3, v4

    .line 295
    :goto_9
    cmp-long v5, v5, v14

    .line 296
    .line 297
    if-lez v5, :cond_10

    .line 298
    .line 299
    const/4 v5, 0x1

    .line 300
    goto :goto_a

    .line 301
    :cond_10
    move v5, v4

    .line 302
    :goto_a
    invoke-static {}, LL/a;->a()Z

    .line 303
    .line 304
    .line 305
    move-result v6

    .line 306
    if-eqz v6, :cond_11

    .line 307
    .line 308
    iget-boolean v6, v2, Ln1/j;->q:Z

    .line 309
    .line 310
    if-eqz v6, :cond_11

    .line 311
    .line 312
    if-nez v3, :cond_11

    .line 313
    .line 314
    if-nez v5, :cond_11

    .line 315
    .line 316
    invoke-static {v8}, LC3/q;->r(Landroid/app/job/JobInfo$Builder;)V

    .line 317
    .line 318
    .line 319
    :cond_11
    invoke-virtual {v8}, Landroid/app/job/JobInfo$Builder;->build()Landroid/app/job/JobInfo;

    .line 320
    .line 321
    .line 322
    move-result-object v3

    .line 323
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 324
    .line 325
    .line 326
    move-result-object v5

    .line 327
    iget-object v6, v2, Ln1/j;->a:Ljava/lang/String;

    .line 328
    .line 329
    new-instance v8, Ljava/lang/StringBuilder;

    .line 330
    .line 331
    const-string v9, "Scheduling work ID "

    .line 332
    .line 333
    invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 334
    .line 335
    .line 336
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 337
    .line 338
    .line 339
    const-string v6, " Job ID "

    .line 340
    .line 341
    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 342
    .line 343
    .line 344
    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    .line 345
    .line 346
    .line 347
    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 348
    .line 349
    .line 350
    move-result-object v6

    .line 351
    new-array v8, v4, [Ljava/lang/Throwable;

    .line 352
    .line 353
    sget-object v9, Li1/b;->e:Ljava/lang/String;

    .line 354
    .line 355
    invoke-virtual {v5, v9, v6, v8}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 356
    .line 357
    .line 358
    :try_start_0
    invoke-virtual {v7, v3}, Landroid/app/job/JobScheduler;->schedule(Landroid/app/job/JobInfo;)I

    .line 359
    .line 360
    .line 361
    move-result v3

    .line 362
    if-nez v3, :cond_12

    .line 363
    .line 364
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 365
    .line 366
    .line 367
    move-result-object v3

    .line 368
    iget-object v5, v2, Ln1/j;->a:Ljava/lang/String;

    .line 369
    .line 370
    new-instance v6, Ljava/lang/StringBuilder;

    .line 371
    .line 372
    invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V

    .line 373
    .line 374
    .line 375
    const-string v8, "Unable to schedule work ID "

    .line 376
    .line 377
    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 378
    .line 379
    .line 380
    invoke-virtual {v6, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 381
    .line 382
    .line 383
    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 384
    .line 385
    .line 386
    move-result-object v5

    .line 387
    new-array v6, v4, [Ljava/lang/Throwable;

    .line 388
    .line 389
    invoke-virtual {v3, v9, v5, v6}, Le1/q;->k(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 390
    .line 391
    .line 392
    iget-boolean v3, v2, Ln1/j;->q:Z

    .line 393
    .line 394
    if-eqz v3, :cond_12

    .line 395
    .line 396
    iget v3, v2, Ln1/j;->r:I

    .line 397
    .line 398
    const/4 v12, 0x1

    .line 399
    if-ne v3, v12, :cond_12

    .line 400
    .line 401
    iput-boolean v4, v2, Ln1/j;->q:Z

    .line 402
    .line 403
    iget-object v3, v2, Ln1/j;->a:Ljava/lang/String;

    .line 404
    .line 405
    new-instance v5, Ljava/lang/StringBuilder;

    .line 406
    .line 407
    invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V

    .line 408
    .line 409
    .line 410
    const-string v6, "Scheduling a non-expedited job (work ID "

    .line 411
    .line 412
    invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 413
    .line 414
    .line 415
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 416
    .line 417
    .line 418
    const-string v3, ")"

    .line 419
    .line 420
    invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    .line 421
    .line 422
    .line 423
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 424
    .line 425
    .line 426
    move-result-object v3

    .line 427
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 428
    .line 429
    .line 430
    move-result-object v5

    .line 431
    new-array v6, v4, [Ljava/lang/Throwable;

    .line 432
    .line 433
    invoke-virtual {v5, v9, v3, v6}, Le1/q;->a(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 434
    .line 435
    .line 436
    invoke-virtual/range {p0 .. p2}, Li1/b;->g(Ln1/j;I)V
    :try_end_0
    .catch Ljava/lang/IllegalStateException; {:try_start_0 .. :try_end_0} :catch_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 437
    .line 438
    .line 439
    return-void

    .line 440
    :catchall_0
    move-exception v0

    .line 441
    goto :goto_b

    .line 442
    :catch_0
    move-exception v0

    .line 443
    goto :goto_c

    .line 444
    :goto_b
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 445
    .line 446
    .line 447
    move-result-object v3

    .line 448
    new-instance v5, Ljava/lang/StringBuilder;

    .line 449
    .line 450
    const-string v6, "Unable to schedule "

    .line 451
    .line 452
    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 453
    .line 454
    .line 455
    invoke-virtual {v5, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 456
    .line 457
    .line 458
    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 459
    .line 460
    .line 461
    move-result-object v2

    .line 462
    const/4 v12, 0x1

    .line 463
    new-array v5, v12, [Ljava/lang/Throwable;

    .line 464
    .line 465
    aput-object v0, v5, v4

    .line 466
    .line 467
    invoke-virtual {v3, v9, v2, v5}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 468
    .line 469
    .line 470
    :cond_12
    return-void

    .line 471
    :goto_c
    iget-object v2, v1, Li1/b;->a:Landroid/content/Context;

    .line 472
    .line 473
    invoke-static {v2, v7}, Li1/b;->e(Landroid/content/Context;Landroid/app/job/JobScheduler;)Ljava/util/ArrayList;

    .line 474
    .line 475
    .line 476
    move-result-object v2

    .line 477
    if-eqz v2, :cond_13

    .line 478
    .line 479
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    .line 480
    .line 481
    .line 482
    move-result v2

    .line 483
    goto :goto_d

    .line 484
    :cond_13
    move v2, v4

    .line 485
    :goto_d
    invoke-static {}, Ljava/util/Locale;->getDefault()Ljava/util/Locale;

    .line 486
    .line 487
    .line 488
    move-result-object v3

    .line 489
    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 490
    .line 491
    .line 492
    move-result-object v2

    .line 493
    iget-object v5, v1, Li1/b;->c:Lf1/k;

    .line 494
    .line 495
    iget-object v6, v5, Lf1/k;->j:Landroidx/work/impl/WorkDatabase;

    .line 496
    .line 497
    invoke-virtual {v6}, Landroidx/work/impl/WorkDatabase;->v()LG6/e;

    .line 498
    .line 499
    .line 500
    move-result-object v6

    .line 501
    invoke-virtual {v6}, LG6/e;->h()Ljava/util/ArrayList;

    .line 502
    .line 503
    .line 504
    move-result-object v6

    .line 505
    invoke-virtual {v6}, Ljava/util/ArrayList;->size()I

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 510
    .line 511
    .line 512
    move-result-object v6

    .line 513
    iget-object v5, v5, Lf1/k;->i:Le1/b;

    .line 514
    .line 515
    sget v7, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 516
    .line 517
    iget v5, v5, Le1/b;->h:I

    .line 518
    .line 519
    const/16 v8, 0x17

    .line 520
    .line 521
    if-ne v7, v8, :cond_14

    .line 522
    .line 523
    div-int/2addr v5, v13

    .line 524
    :cond_14
    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    .line 525
    .line 526
    .line 527
    move-result-object v5

    .line 528
    const/4 v7, 0x3

    .line 529
    new-array v7, v7, [Ljava/lang/Object;

    .line 530
    .line 531
    aput-object v2, v7, v4

    .line 532
    .line 533
    const/4 v12, 0x1

    .line 534
    aput-object v6, v7, v12

    .line 535
    .line 536
    aput-object v5, v7, v13

    .line 537
    .line 538
    const-string v2, "JobScheduler 100 job limit exceeded.  We count %d WorkManager jobs in JobScheduler; we have %d tracked jobs in our DB; our Configuration limit is %d."

    .line 539
    .line 540
    invoke-static {v3, v2, v7}, Ljava/lang/String;->format(Ljava/util/Locale;Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    .line 541
    .line 542
    .line 543
    move-result-object v2

    .line 544
    invoke-static {}, Le1/q;->d()Le1/q;

    .line 545
    .line 546
    .line 547
    move-result-object v3

    .line 548
    new-array v4, v4, [Ljava/lang/Throwable;

    .line 549
    .line 550
    invoke-virtual {v3, v9, v2, v4}, Le1/q;->c(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Throwable;)V

    .line 551
    .line 552
    .line 553
    new-instance v3, Ljava/lang/IllegalStateException;

    .line 554
    .line 555
    invoke-direct {v3, v2, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 556
    .line 557
    .line 558
    throw v3
    .line 559
    .line 560
    .line 561
    .line 562
    .line 563
    .line 564
    .line 565
    .line 566
    .line 567
    .line 568
    .line 569
    .line 570
    .line 571
    .line 572
    .line 573
    .line 574
    .line 575
    .line 576
    .line 577
    .line 578
    .line 579
    .line 580
    .line 581
    .line 582
    .line 583
    .line 584
    .line 585
    .line 586
    .line 587
    .line 588
    .line 589
    .line 590
    .line 591
    .line 592
    .line 593
    .line 594
    .line 595
    .line 596
    .line 597
    .line 598
    .line 599
    .line 600
    .line 601
    .line 602
    .line 603
    .line 604
    .line 605
    .line 606
    .line 607
    .line 608
    .line 609
    .line 610
    .line 611
    .line 612
    .line 613
    .line 614
    .line 615
    .line 616
    .line 617
    .line 618
    .line 619
    .line 620
    .line 621
    .line 622
    .line 623
    .line 624
    .line 625
    .line 626
    .line 627
    .line 628
    .line 629
    .line 630
    .line 631
    .line 632
    .line 633
    .line 634
    .line 635
    .line 636
    .line 637
    .line 638
    .line 639
    .line 640
    .line 641
    .line 642
    .line 643
    .line 644
    .line 645
    .line 646
    .line 647
    .line 648
    .line 649
    .line 650
    .line 651
    .line 652
    .line 653
    .line 654
    .line 655
    .line 656
    .line 657
    .line 658
    .line 659
    .line 660
    .line 661
    .line 662
    .line 663
    .line 664
    .line 665
    .line 666
    .line 667
    .line 668
    .line 669
    .line 670
    .line 671
    .line 672
    .line 673
    .line 674
    .line 675
    .line 676
    .line 677
    .line 678
    .line 679
    .line 680
    .line 681
    .line 682
    .line 683
    .line 684
    .line 685
    .line 686
    .line 687
    .line 688
    .line 689
    .line 690
    .line 691
    .line 692
    .line 693
    .line 694
    .line 695
    .line 696
    .line 697
    .line 698
    .line 699
    .line 700
    .line 701
    .line 702
    .line 703
    .line 704
    .line 705
    .line 706
    .line 707
    .line 708
    .line 709
    .line 710
    .line 711
    .line 712
    .line 713
    .line 714
    .line 715
    .line 716
    .line 717
    .line 718
    .line 719
    .line 720
    .line 721
    .line 722
    .line 723
    .line 724
    .line 725
    .line 726
    .line 727
    .line 728
    .line 729
    .line 730
    .line 731
    .line 732
    .line 733
    .line 734
    .line 735
    .line 736
    .line 737
    .line 738
    .line 739
    .line 740
    .line 741
    .line 742
    .line 743
    .line 744
    .line 745
    .line 746
    .line 747
    .line 748
    .line 749
    .line 750
    .line 751
    .line 752
    .line 753
    .line 754
    .line 755
    .line 756
    .line 757
    .line 758
    .line 759
    .line 760
    .line 761
    .line 762
    .line 763
    .line 764
    .line 765
    .line 766
    .line 767
    .line 768
    .line 769
    .line 770
    .line 771
    .line 772
    .line 773
    .line 774
    .line 775
    .line 776
    .line 777
    .line 778
    .line 779
    .line 780
    .line 781
    .line 782
    .line 783
    .line 784
    .line 785
    .line 786
    .line 787
    .line 788
    .line 789
    .line 790
    .line 791
    .line 792
    .line 793
    .line 794
    .line 795
    .line 796
    .line 797
    .line 798
    .line 799
    .line 800
    .line 801
    .line 802
    .line 803
    .line 804
    .line 805
    .line 806
    .line 807
    .line 808
    .line 809
    .line 810
    .line 811
    .line 812
    .line 813
    .line 814
    .line 815
    .line 816
    .line 817
    .line 818
    .line 819
    .line 820
    .line 821
    .line 822
    .line 823
    .line 824
    .line 825
    .line 826
    .line 827
    .line 828
    .line 829
    .line 830
    .line 831
    .line 832
    .line 833
    .line 834
    .line 835
    .line 836
    .line 837
    .line 838
    .line 839
    .line 840
    .line 841
    .line 842
    .line 843
    .line 844
    .line 845
    .line 846
    .line 847
    .line 848
    .line 849
    .line 850
    .line 851
    .line 852
    .line 853
    .line 854
    .line 855
    .line 856
    .line 857
    .line 858
    .line 859
    .line 860
    .line 861
    .line 862
    .line 863
    .line 864
    .line 865
    .line 866
    .line 867
    .line 868
    .line 869
    .line 870
    .line 871
    .line 872
    .line 873
    .line 874
.end method
