.class public final Lq8/t;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lx8/I;
.implements Ljava/lang/AutoCloseable;


# instance fields
.field public final a:J

.field public b:Z

.field public final c:Lx8/g;

.field public final d:Lx8/g;

.field public e:Z

.field public final synthetic f:Lq8/v;


# direct methods
.method public constructor <init>(Lq8/v;JZ)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, Lq8/t;->f:Lq8/v;

    .line 5
    .line 6
    iput-wide p2, p0, Lq8/t;->a:J

    .line 7
    .line 8
    iput-boolean p4, p0, Lq8/t;->b:Z

    .line 9
    .line 10
    new-instance p1, Lx8/g;

    .line 11
    .line 12
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 13
    .line 14
    .line 15
    iput-object p1, p0, Lq8/t;->c:Lx8/g;

    .line 16
    .line 17
    new-instance p1, Lx8/g;

    .line 18
    .line 19
    invoke-direct {p1}, Ljava/lang/Object;-><init>()V

    .line 20
    .line 21
    .line 22
    iput-object p1, p0, Lq8/t;->d:Lx8/g;

    .line 23
    .line 24
    return-void
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
.method public final b0(Lx8/g;J)J
    .locals 14

    .line 1
    move-object v0, p1

    .line 2
    move-wide/from16 v1, p2

    .line 3
    .line 4
    const-string v3, "sink"

    .line 5
    .line 6
    invoke-static {p1, v3}, Lkotlin/jvm/internal/h;->e(Ljava/lang/Object;Ljava/lang/String;)V

    .line 7
    .line 8
    .line 9
    const-wide/16 v3, 0x0

    .line 10
    .line 11
    cmp-long v5, v1, v3

    .line 12
    .line 13
    if-ltz v5, :cond_9

    .line 14
    .line 15
    :goto_0
    iget-object v5, p0, Lq8/t;->f:Lq8/v;

    .line 16
    .line 17
    monitor-enter v5

    .line 18
    :try_start_0
    iget-object v6, v5, Lq8/v;->k:Lq8/u;

    .line 19
    .line 20
    invoke-virtual {v6}, Lx8/d;->h()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    .line 21
    .line 22
    .line 23
    :try_start_1
    invoke-virtual {v5}, Lq8/v;->f()I

    .line 24
    .line 25
    .line 26
    move-result v6

    .line 27
    if-eqz v6, :cond_0

    .line 28
    .line 29
    iget-boolean v6, p0, Lq8/t;->b:Z

    .line 30
    .line 31
    if-nez v6, :cond_0

    .line 32
    .line 33
    iget-object v6, v5, Lq8/v;->n:Ljava/io/IOException;

    .line 34
    .line 35
    if-nez v6, :cond_1

    .line 36
    .line 37
    new-instance v6, Lq8/A;

    .line 38
    .line 39
    invoke-virtual {v5}, Lq8/v;->f()I

    .line 40
    .line 41
    .line 42
    move-result v7

    .line 43
    invoke-static {v7}, Lcom/google/android/gms/internal/measurement/k1;->s(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v6, v7}, Lq8/A;-><init>(I)V

    .line 47
    .line 48
    .line 49
    goto :goto_1

    .line 50
    :catchall_0
    move-exception v0

    .line 51
    goto :goto_3

    .line 52
    :cond_0
    const/4 v6, 0x0

    .line 53
    :cond_1
    :goto_1
    iget-boolean v7, p0, Lq8/t;->e:Z

    .line 54
    .line 55
    if-nez v7, :cond_8

    .line 56
    .line 57
    iget-object v7, p0, Lq8/t;->d:Lx8/g;

    .line 58
    .line 59
    iget-wide v8, v7, Lx8/g;->b:J

    .line 60
    .line 61
    cmp-long v10, v8, v3

    .line 62
    .line 63
    const-wide/16 v11, -0x1

    .line 64
    .line 65
    const/4 v13, 0x0

    .line 66
    if-lez v10, :cond_2

    .line 67
    .line 68
    invoke-static {v1, v2, v8, v9}, Ljava/lang/Math;->min(JJ)J

    .line 69
    .line 70
    .line 71
    move-result-wide v8

    .line 72
    invoke-virtual {v7, p1, v8, v9}, Lx8/g;->b0(Lx8/g;J)J

    .line 73
    .line 74
    .line 75
    move-result-wide v7

    .line 76
    iget-wide v9, v5, Lq8/v;->c:J

    .line 77
    .line 78
    add-long/2addr v9, v7

    .line 79
    iput-wide v9, v5, Lq8/v;->c:J

    .line 80
    .line 81
    iget-wide v3, v5, Lq8/v;->d:J

    .line 82
    .line 83
    sub-long/2addr v9, v3

    .line 84
    if-nez v6, :cond_4

    .line 85
    .line 86
    iget-object v3, v5, Lq8/v;->b:Lq8/n;

    .line 87
    .line 88
    iget-object v3, v3, Lq8/n;->p:Lq8/z;

    .line 89
    .line 90
    invoke-virtual {v3}, Lq8/z;->a()I

    .line 91
    .line 92
    .line 93
    move-result v3

    .line 94
    div-int/lit8 v3, v3, 0x2

    .line 95
    .line 96
    int-to-long v3, v3

    .line 97
    cmp-long v3, v9, v3

    .line 98
    .line 99
    if-ltz v3, :cond_4

    .line 100
    .line 101
    iget-object v3, v5, Lq8/v;->b:Lq8/n;

    .line 102
    .line 103
    iget v4, v5, Lq8/v;->a:I

    .line 104
    .line 105
    invoke-virtual {v3, v9, v10, v4}, Lq8/n;->O(JI)V

    .line 106
    .line 107
    .line 108
    iget-wide v3, v5, Lq8/v;->c:J

    .line 109
    .line 110
    iput-wide v3, v5, Lq8/v;->d:J

    .line 111
    .line 112
    goto :goto_2

    .line 113
    :cond_2
    iget-boolean v3, p0, Lq8/t;->b:Z

    .line 114
    .line 115
    if-nez v3, :cond_3

    .line 116
    .line 117
    if-nez v6, :cond_3

    .line 118
    .line 119
    invoke-virtual {v5}, Lq8/v;->l()V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    .line 120
    .line 121
    .line 122
    const/4 v13, 0x1

    .line 123
    :cond_3
    move-wide v7, v11

    .line 124
    :cond_4
    :goto_2
    :try_start_2
    iget-object v3, v5, Lq8/v;->k:Lq8/u;

    .line 125
    .line 126
    invoke-virtual {v3}, Lq8/u;->k()V
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    .line 127
    .line 128
    .line 129
    monitor-exit v5

    .line 130
    if-eqz v13, :cond_5

    .line 131
    .line 132
    const-wide/16 v3, 0x0

    .line 133
    .line 134
    goto :goto_0

    .line 135
    :cond_5
    cmp-long v0, v7, v11

    .line 136
    .line 137
    if-eqz v0, :cond_6

    .line 138
    .line 139
    return-wide v7

    .line 140
    :cond_6
    if-nez v6, :cond_7

    .line 141
    .line 142
    return-wide v11

    .line 143
    :cond_7
    throw v6

    .line 144
    :catchall_1
    move-exception v0

    .line 145
    goto :goto_4

    .line 146
    :cond_8
    :try_start_3
    new-instance v0, Ljava/io/IOException;

    .line 147
    .line 148
    const-string v1, "stream closed"

    .line 149
    .line 150
    invoke-direct {v0, v1}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V

    .line 151
    .line 152
    .line 153
    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    .line 154
    :goto_3
    :try_start_4
    iget-object v1, v5, Lq8/v;->k:Lq8/u;

    .line 155
    .line 156
    invoke-virtual {v1}, Lq8/u;->k()V

    .line 157
    .line 158
    .line 159
    throw v0
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_1

    .line 160
    :goto_4
    monitor-exit v5

    .line 161
    throw v0

    .line 162
    :cond_9
    const-string v0, "byteCount < 0: "

    .line 163
    .line 164
    invoke-static {v1, v2, v0}, Lcom/google/android/gms/internal/measurement/k1;->k(JLjava/lang/String;)Ljava/lang/String;

    .line 165
    .line 166
    .line 167
    move-result-object v0

    .line 168
    new-instance v1, Ljava/lang/IllegalArgumentException;

    .line 169
    .line 170
    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    .line 171
    .line 172
    .line 173
    move-result-object v0

    .line 174
    invoke-direct {v1, v0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    .line 175
    .line 176
    .line 177
    throw v1
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

.method public final c()Lx8/K;
    .locals 1

    .line 1
    iget-object v0, p0, Lq8/t;->f:Lq8/v;

    .line 2
    .line 3
    iget-object v0, v0, Lq8/v;->k:Lq8/u;

    .line 4
    .line 5
    return-object v0
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

.method public final close()V
    .locals 4

    .line 1
    iget-object v0, p0, Lq8/t;->f:Lq8/v;

    .line 2
    .line 3
    monitor-enter v0

    .line 4
    const/4 v1, 0x1

    .line 5
    :try_start_0
    iput-boolean v1, p0, Lq8/t;->e:Z

    .line 6
    .line 7
    iget-object v1, p0, Lq8/t;->d:Lx8/g;

    .line 8
    .line 9
    iget-wide v2, v1, Lx8/g;->b:J

    .line 10
    .line 11
    invoke-virtual {v1}, Lx8/g;->x()V

    .line 12
    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->notifyAll()V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    .line 15
    .line 16
    .line 17
    monitor-exit v0

    .line 18
    const-wide/16 v0, 0x0

    .line 19
    .line 20
    cmp-long v0, v2, v0

    .line 21
    .line 22
    if-lez v0, :cond_0

    .line 23
    .line 24
    sget-object v0, Lk8/c;->a:[B

    .line 25
    .line 26
    iget-object v0, p0, Lq8/t;->f:Lq8/v;

    .line 27
    .line 28
    iget-object v0, v0, Lq8/v;->b:Lq8/n;

    .line 29
    .line 30
    invoke-virtual {v0, v2, v3}, Lq8/n;->F(J)V

    .line 31
    .line 32
    .line 33
    :cond_0
    iget-object v0, p0, Lq8/t;->f:Lq8/v;

    .line 34
    .line 35
    invoke-virtual {v0}, Lq8/v;->a()V

    .line 36
    .line 37
    .line 38
    return-void

    .line 39
    :catchall_0
    move-exception v1

    .line 40
    monitor-exit v0

    .line 41
    throw v1
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
.end method
