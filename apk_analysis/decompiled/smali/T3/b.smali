.class public final LT3/b;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lk4/H;


# instance fields
.field public final a:Landroid/net/Uri;

.field public final b:Lk4/M;

.field public final c:Lk4/m;

.field public d:LT3/j;

.field public e:J

.field public f:J

.field public g:J

.field public h:J

.field public i:Z

.field public j:Ljava/io/IOException;

.field public final synthetic k:LT3/c;


# direct methods
.method public constructor <init>(LT3/c;Landroid/net/Uri;)V
    .locals 1

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    iput-object p1, p0, LT3/b;->k:LT3/c;

    .line 5
    .line 6
    iput-object p2, p0, LT3/b;->a:Landroid/net/Uri;

    .line 7
    .line 8
    new-instance p2, Lk4/M;

    .line 9
    .line 10
    const-string v0, "DefaultHlsPlaylistTracker:MediaPlaylist"

    .line 11
    .line 12
    invoke-direct {p2, v0}, Lk4/M;-><init>(Ljava/lang/String;)V

    .line 13
    .line 14
    .line 15
    iput-object p2, p0, LT3/b;->b:Lk4/M;

    .line 16
    .line 17
    iget-object p1, p1, LT3/c;->a:Lb7/c;

    .line 18
    .line 19
    iget-object p1, p1, Lb7/c;->b:Ljava/lang/Object;

    .line 20
    .line 21
    check-cast p1, Lk4/l;

    .line 22
    .line 23
    invoke-interface {p1}, Lk4/l;->c()Lk4/m;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LT3/b;->c:Lk4/m;

    .line 28
    .line 29
    return-void
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

.method public static a(LT3/b;J)Z
    .locals 7

    .line 1
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 2
    .line 3
    .line 4
    move-result-wide v0

    .line 5
    add-long/2addr v0, p1

    .line 6
    iput-wide v0, p0, LT3/b;->h:J

    .line 7
    .line 8
    iget-object p1, p0, LT3/b;->k:LT3/c;

    .line 9
    .line 10
    iget-object p2, p1, LT3/c;->k:Landroid/net/Uri;

    .line 11
    .line 12
    iget-object p0, p0, LT3/b;->a:Landroid/net/Uri;

    .line 13
    .line 14
    invoke-virtual {p0, p2}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 15
    .line 16
    .line 17
    move-result p0

    .line 18
    const/4 p2, 0x0

    .line 19
    if-eqz p0, :cond_2

    .line 20
    .line 21
    iget-object p0, p1, LT3/c;->j:LT3/m;

    .line 22
    .line 23
    iget-object p0, p0, LT3/m;->e:Ljava/util/List;

    .line 24
    .line 25
    invoke-interface {p0}, Ljava/util/List;->size()I

    .line 26
    .line 27
    .line 28
    move-result v0

    .line 29
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 30
    .line 31
    .line 32
    move-result-wide v1

    .line 33
    move v3, p2

    .line 34
    :goto_0
    if-ge v3, v0, :cond_1

    .line 35
    .line 36
    iget-object v4, p1, LT3/c;->d:Ljava/util/HashMap;

    .line 37
    .line 38
    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 39
    .line 40
    .line 41
    move-result-object v5

    .line 42
    check-cast v5, LT3/l;

    .line 43
    .line 44
    iget-object v5, v5, LT3/l;->a:Landroid/net/Uri;

    .line 45
    .line 46
    invoke-virtual {v4, v5}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;

    .line 47
    .line 48
    .line 49
    move-result-object v4

    .line 50
    check-cast v4, LT3/b;

    .line 51
    .line 52
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    iget-wide v5, v4, LT3/b;->h:J

    .line 56
    .line 57
    cmp-long v5, v1, v5

    .line 58
    .line 59
    if-lez v5, :cond_0

    .line 60
    .line 61
    iget-object p0, v4, LT3/b;->a:Landroid/net/Uri;

    .line 62
    .line 63
    iput-object p0, p1, LT3/c;->k:Landroid/net/Uri;

    .line 64
    .line 65
    invoke-virtual {p1, p0}, LT3/c;->b(Landroid/net/Uri;)Landroid/net/Uri;

    .line 66
    .line 67
    .line 68
    move-result-object p0

    .line 69
    invoke-virtual {v4, p0}, LT3/b;->c(Landroid/net/Uri;)V

    .line 70
    .line 71
    .line 72
    return p2

    .line 73
    :cond_0
    add-int/lit8 v3, v3, 0x1

    .line 74
    .line 75
    goto :goto_0

    .line 76
    :cond_1
    const/4 p0, 0x1

    .line 77
    return p0

    .line 78
    :cond_2
    return p2
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
.method public final b(Landroid/net/Uri;)V
    .locals 14

    .line 1
    iget-object v0, p0, LT3/b;->k:LT3/c;

    .line 2
    .line 3
    iget-object v1, v0, LT3/c;->b:LT3/q;

    .line 4
    .line 5
    iget-object v2, v0, LT3/c;->j:LT3/m;

    .line 6
    .line 7
    iget-object v3, p0, LT3/b;->d:LT3/j;

    .line 8
    .line 9
    invoke-interface {v1, v2, v3}, LT3/q;->g(LT3/m;LT3/j;)Lk4/O;

    .line 10
    .line 11
    .line 12
    move-result-object v1

    .line 13
    new-instance v2, Lk4/P;

    .line 14
    .line 15
    iget-object v3, p0, LT3/b;->c:Lk4/m;

    .line 16
    .line 17
    const/4 v4, 0x4

    .line 18
    invoke-direct {v2, v3, p1, v4, v1}, Lk4/P;-><init>(Lk4/m;Landroid/net/Uri;ILk4/O;)V

    .line 19
    .line 20
    .line 21
    iget-object p1, v0, LT3/c;->c:Le1/q;

    .line 22
    .line 23
    iget v5, v2, Lk4/P;->c:I

    .line 24
    .line 25
    invoke-virtual {p1, v5}, Le1/q;->f(I)I

    .line 26
    .line 27
    .line 28
    move-result p1

    .line 29
    iget-object v1, p0, LT3/b;->b:Lk4/M;

    .line 30
    .line 31
    invoke-virtual {v1, v2, p0, p1}, Lk4/M;->f(Lk4/J;Lk4/H;I)J

    .line 32
    .line 33
    .line 34
    iget-object v3, v0, LT3/c;->f:LN3/G;

    .line 35
    .line 36
    new-instance v4, LN3/q;

    .line 37
    .line 38
    iget-object p1, v2, Lk4/P;->b:Lk4/p;

    .line 39
    .line 40
    invoke-direct {v4, p1}, LN3/q;-><init>(Lk4/p;)V

    .line 41
    .line 42
    .line 43
    const-wide v10, -0x7fffffffffffffffL    # -4.9E-324

    .line 44
    .line 45
    .line 46
    .line 47
    .line 48
    const-wide v12, -0x7fffffffffffffffL    # -4.9E-324

    .line 49
    .line 50
    .line 51
    .line 52
    .line 53
    const/4 v6, -0x1

    .line 54
    const/4 v7, 0x0

    .line 55
    const/4 v8, 0x0

    .line 56
    const/4 v9, 0x0

    .line 57
    invoke-virtual/range {v3 .. v13}, LN3/G;->l(LN3/q;IILj3/M;ILjava/lang/Object;JJ)V

    .line 58
    .line 59
    .line 60
    return-void
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

.method public final c(Landroid/net/Uri;)V
    .locals 7

    .line 1
    const-wide/16 v0, 0x0

    .line 2
    .line 3
    iput-wide v0, p0, LT3/b;->h:J

    .line 4
    .line 5
    iget-boolean v0, p0, LT3/b;->i:Z

    .line 6
    .line 7
    if-nez v0, :cond_2

    .line 8
    .line 9
    iget-object v0, p0, LT3/b;->b:Lk4/M;

    .line 10
    .line 11
    invoke-virtual {v0}, Lk4/M;->d()Z

    .line 12
    .line 13
    .line 14
    move-result v1

    .line 15
    if-nez v1, :cond_2

    .line 16
    .line 17
    invoke-virtual {v0}, Lk4/M;->c()Z

    .line 18
    .line 19
    .line 20
    move-result v0

    .line 21
    if-eqz v0, :cond_0

    .line 22
    .line 23
    goto :goto_0

    .line 24
    :cond_0
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 25
    .line 26
    .line 27
    move-result-wide v0

    .line 28
    iget-wide v2, p0, LT3/b;->g:J

    .line 29
    .line 30
    cmp-long v4, v0, v2

    .line 31
    .line 32
    if-gez v4, :cond_1

    .line 33
    .line 34
    const/4 v4, 0x1

    .line 35
    iput-boolean v4, p0, LT3/b;->i:Z

    .line 36
    .line 37
    iget-object v4, p0, LT3/b;->k:LT3/c;

    .line 38
    .line 39
    iget-object v4, v4, LT3/c;->h:Landroid/os/Handler;

    .line 40
    .line 41
    new-instance v5, LA6/r;

    .line 42
    .line 43
    const/4 v6, 0x6

    .line 44
    invoke-direct {v5, p0, v6, p1}, LA6/r;-><init>(Ljava/lang/Object;ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    sub-long/2addr v2, v0

    .line 48
    invoke-virtual {v4, v5, v2, v3}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z

    .line 49
    .line 50
    .line 51
    return-void

    .line 52
    :cond_1
    invoke-virtual {p0, p1}, LT3/b;->b(Landroid/net/Uri;)V

    .line 53
    .line 54
    .line 55
    :cond_2
    :goto_0
    return-void
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

.method public final d(LT3/j;)V
    .locals 64

    .line 1
    move-object/from16 v0, p0

    .line 2
    .line 3
    move-object/from16 v1, p1

    .line 4
    .line 5
    iget-object v2, v0, LT3/b;->d:LT3/j;

    .line 6
    .line 7
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 8
    .line 9
    .line 10
    move-result-wide v3

    .line 11
    iput-wide v3, v0, LT3/b;->e:J

    .line 12
    .line 13
    iget-object v5, v0, LT3/b;->k:LT3/c;

    .line 14
    .line 15
    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 16
    .line 17
    .line 18
    if-eqz v2, :cond_6

    .line 19
    .line 20
    iget-wide v10, v1, LT3/j;->k:J

    .line 21
    .line 22
    iget-wide v12, v2, LT3/j;->k:J

    .line 23
    .line 24
    cmp-long v10, v10, v12

    .line 25
    .line 26
    if-lez v10, :cond_0

    .line 27
    .line 28
    goto/16 :goto_1

    .line 29
    .line 30
    :cond_0
    iget-boolean v11, v2, LT3/j;->o:Z

    .line 31
    .line 32
    iget-object v12, v2, LT3/j;->s:LP5/F;

    .line 33
    .line 34
    iget-object v13, v2, LT3/j;->r:LP5/F;

    .line 35
    .line 36
    iget-boolean v14, v1, LT3/j;->o:Z

    .line 37
    .line 38
    if-gez v10, :cond_1

    .line 39
    .line 40
    goto :goto_0

    .line 41
    :cond_1
    iget-object v10, v1, LT3/j;->r:LP5/F;

    .line 42
    .line 43
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 44
    .line 45
    .line 46
    move-result v10

    .line 47
    invoke-interface {v13}, Ljava/util/List;->size()I

    .line 48
    .line 49
    .line 50
    move-result v15

    .line 51
    sub-int/2addr v10, v15

    .line 52
    if-eqz v10, :cond_2

    .line 53
    .line 54
    if-lez v10, :cond_3

    .line 55
    .line 56
    goto/16 :goto_1

    .line 57
    .line 58
    :cond_2
    iget-object v10, v1, LT3/j;->s:LP5/F;

    .line 59
    .line 60
    invoke-interface {v10}, Ljava/util/List;->size()I

    .line 61
    .line 62
    .line 63
    move-result v10

    .line 64
    invoke-interface {v12}, Ljava/util/List;->size()I

    .line 65
    .line 66
    .line 67
    move-result v15

    .line 68
    if-gt v10, v15, :cond_7

    .line 69
    .line 70
    if-ne v10, v15, :cond_3

    .line 71
    .line 72
    if-eqz v14, :cond_3

    .line 73
    .line 74
    if-nez v11, :cond_3

    .line 75
    .line 76
    goto :goto_1

    .line 77
    :cond_3
    :goto_0
    if-eqz v14, :cond_4

    .line 78
    .line 79
    if-eqz v11, :cond_5

    .line 80
    .line 81
    :cond_4
    move-object v12, v2

    .line 82
    goto/16 :goto_b

    .line 83
    .line 84
    :cond_5
    move-object/from16 v35, v12

    .line 85
    .line 86
    new-instance v12, LT3/j;

    .line 87
    .line 88
    const/16 v31, 0x1

    .line 89
    .line 90
    iget-boolean v10, v2, LT3/j;->p:Z

    .line 91
    .line 92
    move-object/from16 v34, v13

    .line 93
    .line 94
    iget v13, v2, LT3/j;->d:I

    .line 95
    .line 96
    iget-object v14, v2, LT3/n;->a:Ljava/lang/String;

    .line 97
    .line 98
    iget-object v15, v2, LT3/n;->b:Ljava/util/List;

    .line 99
    .line 100
    iget-wide v8, v2, LT3/j;->e:J

    .line 101
    .line 102
    iget-boolean v11, v2, LT3/j;->g:Z

    .line 103
    .line 104
    iget-wide v6, v2, LT3/j;->h:J

    .line 105
    .line 106
    move-wide/from16 v19, v6

    .line 107
    .line 108
    iget-boolean v6, v2, LT3/j;->i:Z

    .line 109
    .line 110
    iget v7, v2, LT3/j;->j:I

    .line 111
    .line 112
    move/from16 v21, v6

    .line 113
    .line 114
    move/from16 v22, v7

    .line 115
    .line 116
    iget-wide v6, v2, LT3/j;->k:J

    .line 117
    .line 118
    move-wide/from16 v23, v6

    .line 119
    .line 120
    iget v6, v2, LT3/j;->l:I

    .line 121
    .line 122
    move/from16 v25, v6

    .line 123
    .line 124
    iget-wide v6, v2, LT3/j;->m:J

    .line 125
    .line 126
    move-wide/from16 v26, v6

    .line 127
    .line 128
    iget-wide v6, v2, LT3/j;->n:J

    .line 129
    .line 130
    move-wide/from16 v28, v6

    .line 131
    .line 132
    iget-boolean v6, v2, LT3/n;->c:Z

    .line 133
    .line 134
    iget-object v7, v2, LT3/j;->q:Ln3/g;

    .line 135
    .line 136
    move/from16 v30, v6

    .line 137
    .line 138
    iget-object v6, v2, LT3/j;->v:LT3/i;

    .line 139
    .line 140
    move-object/from16 v36, v6

    .line 141
    .line 142
    iget-object v6, v2, LT3/j;->t:LP5/X;

    .line 143
    .line 144
    move-object/from16 v37, v6

    .line 145
    .line 146
    move-object/from16 v33, v7

    .line 147
    .line 148
    move-wide/from16 v16, v8

    .line 149
    .line 150
    move/from16 v32, v10

    .line 151
    .line 152
    move/from16 v18, v11

    .line 153
    .line 154
    invoke-direct/range {v12 .. v37}, LT3/j;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLn3/g;Ljava/util/List;Ljava/util/List;LT3/i;Ljava/util/Map;)V

    .line 155
    .line 156
    .line 157
    goto/16 :goto_b

    .line 158
    .line 159
    :cond_6
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 160
    .line 161
    .line 162
    :cond_7
    :goto_1
    iget-boolean v6, v1, LT3/j;->p:Z

    .line 163
    .line 164
    iget-wide v7, v1, LT3/j;->k:J

    .line 165
    .line 166
    if-eqz v6, :cond_9

    .line 167
    .line 168
    iget-wide v9, v1, LT3/j;->h:J

    .line 169
    .line 170
    :goto_2
    move-wide/from16 v16, v7

    .line 171
    .line 172
    :cond_8
    :goto_3
    move-wide/from16 v45, v9

    .line 173
    .line 174
    goto :goto_6

    .line 175
    :cond_9
    iget-object v6, v5, LT3/c;->l:LT3/j;

    .line 176
    .line 177
    if-eqz v6, :cond_a

    .line 178
    .line 179
    iget-wide v9, v6, LT3/j;->h:J

    .line 180
    .line 181
    goto :goto_4

    .line 182
    :cond_a
    const-wide/16 v9, 0x0

    .line 183
    .line 184
    :goto_4
    if-nez v2, :cond_b

    .line 185
    .line 186
    goto :goto_2

    .line 187
    :cond_b
    iget-object v6, v2, LT3/j;->r:LP5/F;

    .line 188
    .line 189
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 190
    .line 191
    .line 192
    move-result v11

    .line 193
    iget-wide v12, v2, LT3/j;->k:J

    .line 194
    .line 195
    sub-long v14, v7, v12

    .line 196
    .line 197
    long-to-int v14, v14

    .line 198
    invoke-interface {v6}, Ljava/util/List;->size()I

    .line 199
    .line 200
    .line 201
    move-result v15

    .line 202
    if-ge v14, v15, :cond_c

    .line 203
    .line 204
    invoke-interface {v6, v14}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 205
    .line 206
    .line 207
    move-result-object v6

    .line 208
    check-cast v6, LT3/g;

    .line 209
    .line 210
    goto :goto_5

    .line 211
    :cond_c
    const/4 v6, 0x0

    .line 212
    :goto_5
    iget-wide v14, v2, LT3/j;->h:J

    .line 213
    .line 214
    if-eqz v6, :cond_d

    .line 215
    .line 216
    iget-wide v9, v6, LT3/h;->e:J

    .line 217
    .line 218
    add-long/2addr v9, v14

    .line 219
    goto :goto_2

    .line 220
    :cond_d
    move-wide/from16 v16, v7

    .line 221
    .line 222
    int-to-long v6, v11

    .line 223
    sub-long v12, v16, v12

    .line 224
    .line 225
    cmp-long v6, v6, v12

    .line 226
    .line 227
    if-nez v6, :cond_8

    .line 228
    .line 229
    iget-wide v6, v2, LT3/j;->u:J

    .line 230
    .line 231
    add-long v9, v14, v6

    .line 232
    .line 233
    goto :goto_3

    .line 234
    :goto_6
    iget-boolean v6, v1, LT3/j;->i:Z

    .line 235
    .line 236
    iget-object v7, v1, LT3/j;->r:LP5/F;

    .line 237
    .line 238
    if-eqz v6, :cond_e

    .line 239
    .line 240
    iget v6, v1, LT3/j;->j:I

    .line 241
    .line 242
    move/from16 v48, v6

    .line 243
    .line 244
    const/4 v8, 0x0

    .line 245
    goto :goto_a

    .line 246
    :cond_e
    iget-object v6, v5, LT3/c;->l:LT3/j;

    .line 247
    .line 248
    if-eqz v6, :cond_f

    .line 249
    .line 250
    iget v6, v6, LT3/j;->j:I

    .line 251
    .line 252
    goto :goto_7

    .line 253
    :cond_f
    const/4 v6, 0x0

    .line 254
    :goto_7
    if-nez v2, :cond_11

    .line 255
    .line 256
    :cond_10
    const/4 v8, 0x0

    .line 257
    goto :goto_9

    .line 258
    :cond_11
    iget-wide v8, v2, LT3/j;->k:J

    .line 259
    .line 260
    sub-long v8, v16, v8

    .line 261
    .line 262
    long-to-int v8, v8

    .line 263
    iget-object v9, v2, LT3/j;->r:LP5/F;

    .line 264
    .line 265
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 266
    .line 267
    .line 268
    move-result v10

    .line 269
    if-ge v8, v10, :cond_12

    .line 270
    .line 271
    invoke-interface {v9, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 272
    .line 273
    .line 274
    move-result-object v8

    .line 275
    check-cast v8, LT3/g;

    .line 276
    .line 277
    goto :goto_8

    .line 278
    :cond_12
    const/4 v8, 0x0

    .line 279
    :goto_8
    if-eqz v8, :cond_10

    .line 280
    .line 281
    iget v6, v2, LT3/j;->j:I

    .line 282
    .line 283
    iget v8, v8, LT3/h;->d:I

    .line 284
    .line 285
    add-int/2addr v6, v8

    .line 286
    const/4 v8, 0x0

    .line 287
    invoke-interface {v7, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    .line 288
    .line 289
    .line 290
    move-result-object v9

    .line 291
    check-cast v9, LT3/g;

    .line 292
    .line 293
    iget v9, v9, LT3/h;->d:I

    .line 294
    .line 295
    sub-int/2addr v6, v9

    .line 296
    :goto_9
    move/from16 v48, v6

    .line 297
    .line 298
    :goto_a
    new-instance v38, LT3/j;

    .line 299
    .line 300
    iget-boolean v6, v1, LT3/j;->o:Z

    .line 301
    .line 302
    iget-boolean v9, v1, LT3/j;->p:Z

    .line 303
    .line 304
    iget v10, v1, LT3/j;->d:I

    .line 305
    .line 306
    iget-object v11, v1, LT3/n;->a:Ljava/lang/String;

    .line 307
    .line 308
    iget-object v12, v1, LT3/n;->b:Ljava/util/List;

    .line 309
    .line 310
    iget-wide v13, v1, LT3/j;->e:J

    .line 311
    .line 312
    iget-boolean v15, v1, LT3/j;->g:Z

    .line 313
    .line 314
    const/16 v47, 0x1

    .line 315
    .line 316
    move/from16 v58, v9

    .line 317
    .line 318
    iget-wide v8, v1, LT3/j;->k:J

    .line 319
    .line 320
    move/from16 v57, v6

    .line 321
    .line 322
    iget v6, v1, LT3/j;->l:I

    .line 323
    .line 324
    move/from16 v51, v6

    .line 325
    .line 326
    move-object/from16 v60, v7

    .line 327
    .line 328
    iget-wide v6, v1, LT3/j;->m:J

    .line 329
    .line 330
    move-wide/from16 v52, v6

    .line 331
    .line 332
    iget-wide v6, v1, LT3/j;->n:J

    .line 333
    .line 334
    move-wide/from16 v54, v6

    .line 335
    .line 336
    iget-boolean v6, v1, LT3/n;->c:Z

    .line 337
    .line 338
    iget-object v7, v1, LT3/j;->q:Ln3/g;

    .line 339
    .line 340
    move/from16 v56, v6

    .line 341
    .line 342
    iget-object v6, v1, LT3/j;->s:LP5/F;

    .line 343
    .line 344
    move-object/from16 v61, v6

    .line 345
    .line 346
    iget-object v6, v1, LT3/j;->v:LT3/i;

    .line 347
    .line 348
    move-object/from16 v62, v6

    .line 349
    .line 350
    iget-object v6, v1, LT3/j;->t:LP5/X;

    .line 351
    .line 352
    move-object/from16 v63, v6

    .line 353
    .line 354
    move-object/from16 v59, v7

    .line 355
    .line 356
    move-wide/from16 v49, v8

    .line 357
    .line 358
    move/from16 v39, v10

    .line 359
    .line 360
    move-object/from16 v40, v11

    .line 361
    .line 362
    move-object/from16 v41, v12

    .line 363
    .line 364
    move-wide/from16 v42, v13

    .line 365
    .line 366
    move/from16 v44, v15

    .line 367
    .line 368
    invoke-direct/range {v38 .. v63}, LT3/j;-><init>(ILjava/lang/String;Ljava/util/List;JZJZIJIJJZZZLn3/g;Ljava/util/List;Ljava/util/List;LT3/i;Ljava/util/Map;)V

    .line 369
    .line 370
    .line 371
    move-object/from16 v12, v38

    .line 372
    .line 373
    :goto_b
    iput-object v12, v0, LT3/b;->d:LT3/j;

    .line 374
    .line 375
    iget-object v6, v5, LT3/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 376
    .line 377
    const/4 v7, 0x1

    .line 378
    iget-object v8, v0, LT3/b;->a:Landroid/net/Uri;

    .line 379
    .line 380
    iget-boolean v9, v12, LT3/j;->o:Z

    .line 381
    .line 382
    if-eq v12, v2, :cond_15

    .line 383
    .line 384
    const/4 v10, 0x0

    .line 385
    iput-object v10, v0, LT3/b;->j:Ljava/io/IOException;

    .line 386
    .line 387
    iput-wide v3, v0, LT3/b;->f:J

    .line 388
    .line 389
    iget-object v1, v5, LT3/c;->k:Landroid/net/Uri;

    .line 390
    .line 391
    invoke-virtual {v8, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 392
    .line 393
    .line 394
    move-result v1

    .line 395
    if-eqz v1, :cond_14

    .line 396
    .line 397
    iget-object v1, v5, LT3/c;->l:LT3/j;

    .line 398
    .line 399
    if-nez v1, :cond_13

    .line 400
    .line 401
    xor-int/lit8 v1, v9, 0x1

    .line 402
    .line 403
    iput-boolean v1, v5, LT3/c;->m:Z

    .line 404
    .line 405
    iget-wide v9, v12, LT3/j;->h:J

    .line 406
    .line 407
    iput-wide v9, v5, LT3/c;->n:J

    .line 408
    .line 409
    :cond_13
    iput-object v12, v5, LT3/c;->l:LT3/j;

    .line 410
    .line 411
    iget-object v1, v5, LT3/c;->i:LS3/m;

    .line 412
    .line 413
    invoke-virtual {v1, v12}, LS3/m;->w(LT3/j;)V

    .line 414
    .line 415
    .line 416
    :cond_14
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 417
    .line 418
    .line 419
    move-result-object v1

    .line 420
    :goto_c
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 421
    .line 422
    .line 423
    move-result v6

    .line 424
    if-eqz v6, :cond_18

    .line 425
    .line 426
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 427
    .line 428
    .line 429
    move-result-object v6

    .line 430
    check-cast v6, LT3/r;

    .line 431
    .line 432
    invoke-interface {v6}, LT3/r;->b()V

    .line 433
    .line 434
    .line 435
    goto :goto_c

    .line 436
    :cond_15
    const/4 v10, 0x0

    .line 437
    if-nez v9, :cond_18

    .line 438
    .line 439
    iget-object v9, v1, LT3/j;->r:LP5/F;

    .line 440
    .line 441
    invoke-interface {v9}, Ljava/util/List;->size()I

    .line 442
    .line 443
    .line 444
    move-result v9

    .line 445
    int-to-long v11, v9

    .line 446
    iget-wide v13, v1, LT3/j;->k:J

    .line 447
    .line 448
    add-long/2addr v13, v11

    .line 449
    iget-object v1, v0, LT3/b;->d:LT3/j;

    .line 450
    .line 451
    iget-wide v11, v1, LT3/j;->k:J

    .line 452
    .line 453
    cmp-long v9, v13, v11

    .line 454
    .line 455
    if-gez v9, :cond_16

    .line 456
    .line 457
    new-instance v1, LN3/M;

    .line 458
    .line 459
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 460
    .line 461
    .line 462
    move v9, v7

    .line 463
    goto :goto_e

    .line 464
    :cond_16
    iget-wide v11, v0, LT3/b;->f:J

    .line 465
    .line 466
    sub-long v11, v3, v11

    .line 467
    .line 468
    long-to-double v11, v11

    .line 469
    iget-wide v13, v1, LT3/j;->m:J

    .line 470
    .line 471
    invoke-static {v13, v14}, Ll4/y;->T(J)J

    .line 472
    .line 473
    .line 474
    move-result-wide v13

    .line 475
    long-to-double v13, v13

    .line 476
    const-wide/high16 v15, 0x400c000000000000L    # 3.5

    .line 477
    .line 478
    mul-double/2addr v13, v15

    .line 479
    cmpl-double v1, v11, v13

    .line 480
    .line 481
    if-lez v1, :cond_17

    .line 482
    .line 483
    new-instance v1, LN3/M;

    .line 484
    .line 485
    invoke-direct {v1}, Ljava/io/IOException;-><init>()V

    .line 486
    .line 487
    .line 488
    :goto_d
    const/4 v9, 0x0

    .line 489
    goto :goto_e

    .line 490
    :cond_17
    move-object v1, v10

    .line 491
    goto :goto_d

    .line 492
    :goto_e
    if-eqz v1, :cond_18

    .line 493
    .line 494
    iput-object v1, v0, LT3/b;->j:Ljava/io/IOException;

    .line 495
    .line 496
    new-instance v10, LA1/i;

    .line 497
    .line 498
    invoke-direct {v10, v7, v1}, LA1/i;-><init>(ILjava/lang/Object;)V

    .line 499
    .line 500
    .line 501
    invoke-virtual {v6}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 502
    .line 503
    .line 504
    move-result-object v1

    .line 505
    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    .line 506
    .line 507
    .line 508
    move-result v6

    .line 509
    if-eqz v6, :cond_18

    .line 510
    .line 511
    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 512
    .line 513
    .line 514
    move-result-object v6

    .line 515
    check-cast v6, LT3/r;

    .line 516
    .line 517
    invoke-interface {v6, v8, v10, v9}, LT3/r;->d(Landroid/net/Uri;LA1/i;Z)Z

    .line 518
    .line 519
    .line 520
    goto :goto_f

    .line 521
    :cond_18
    iget-object v1, v0, LT3/b;->d:LT3/j;

    .line 522
    .line 523
    iget-object v6, v1, LT3/j;->v:LT3/i;

    .line 524
    .line 525
    iget-boolean v6, v6, LT3/i;->e:Z

    .line 526
    .line 527
    if-nez v6, :cond_1a

    .line 528
    .line 529
    iget-wide v6, v1, LT3/j;->m:J

    .line 530
    .line 531
    if-eq v1, v2, :cond_19

    .line 532
    .line 533
    goto :goto_10

    .line 534
    :cond_19
    const-wide/16 v1, 0x2

    .line 535
    .line 536
    div-long/2addr v6, v1

    .line 537
    goto :goto_10

    .line 538
    :cond_1a
    const-wide/16 v6, 0x0

    .line 539
    .line 540
    :goto_10
    invoke-static {v6, v7}, Ll4/y;->T(J)J

    .line 541
    .line 542
    .line 543
    move-result-wide v1

    .line 544
    add-long/2addr v1, v3

    .line 545
    iput-wide v1, v0, LT3/b;->g:J

    .line 546
    .line 547
    iget-object v1, v0, LT3/b;->d:LT3/j;

    .line 548
    .line 549
    iget-wide v1, v1, LT3/j;->n:J

    .line 550
    .line 551
    const-wide v3, -0x7fffffffffffffffL    # -4.9E-324

    .line 552
    .line 553
    .line 554
    .line 555
    .line 556
    cmp-long v1, v1, v3

    .line 557
    .line 558
    if-nez v1, :cond_1b

    .line 559
    .line 560
    iget-object v1, v5, LT3/c;->k:Landroid/net/Uri;

    .line 561
    .line 562
    invoke-virtual {v8, v1}, Landroid/net/Uri;->equals(Ljava/lang/Object;)Z

    .line 563
    .line 564
    .line 565
    move-result v1

    .line 566
    if-eqz v1, :cond_21

    .line 567
    .line 568
    :cond_1b
    iget-object v1, v0, LT3/b;->d:LT3/j;

    .line 569
    .line 570
    iget-boolean v2, v1, LT3/j;->o:Z

    .line 571
    .line 572
    if-nez v2, :cond_21

    .line 573
    .line 574
    iget-object v1, v1, LT3/j;->v:LT3/i;

    .line 575
    .line 576
    iget-wide v5, v1, LT3/i;->a:J

    .line 577
    .line 578
    cmp-long v2, v5, v3

    .line 579
    .line 580
    if-nez v2, :cond_1c

    .line 581
    .line 582
    iget-boolean v1, v1, LT3/i;->e:Z

    .line 583
    .line 584
    if-nez v1, :cond_1c

    .line 585
    .line 586
    goto :goto_12

    .line 587
    :cond_1c
    invoke-virtual {v8}, Landroid/net/Uri;->buildUpon()Landroid/net/Uri$Builder;

    .line 588
    .line 589
    .line 590
    move-result-object v1

    .line 591
    iget-object v2, v0, LT3/b;->d:LT3/j;

    .line 592
    .line 593
    iget-object v5, v2, LT3/j;->v:LT3/i;

    .line 594
    .line 595
    iget-boolean v5, v5, LT3/i;->e:Z

    .line 596
    .line 597
    if-eqz v5, :cond_1e

    .line 598
    .line 599
    iget-object v5, v2, LT3/j;->r:LP5/F;

    .line 600
    .line 601
    invoke-interface {v5}, Ljava/util/List;->size()I

    .line 602
    .line 603
    .line 604
    move-result v5

    .line 605
    int-to-long v5, v5

    .line 606
    iget-wide v7, v2, LT3/j;->k:J

    .line 607
    .line 608
    add-long/2addr v7, v5

    .line 609
    const-string v2, "_HLS_msn"

    .line 610
    .line 611
    invoke-static {v7, v8}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    .line 612
    .line 613
    .line 614
    move-result-object v5

    .line 615
    invoke-virtual {v1, v2, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 616
    .line 617
    .line 618
    iget-object v2, v0, LT3/b;->d:LT3/j;

    .line 619
    .line 620
    iget-wide v5, v2, LT3/j;->n:J

    .line 621
    .line 622
    cmp-long v5, v5, v3

    .line 623
    .line 624
    if-eqz v5, :cond_1e

    .line 625
    .line 626
    iget-object v2, v2, LT3/j;->s:LP5/F;

    .line 627
    .line 628
    invoke-interface {v2}, Ljava/util/List;->size()I

    .line 629
    .line 630
    .line 631
    move-result v5

    .line 632
    invoke-interface {v2}, Ljava/util/List;->isEmpty()Z

    .line 633
    .line 634
    .line 635
    move-result v6

    .line 636
    if-nez v6, :cond_1d

    .line 637
    .line 638
    invoke-static {v2}, LP5/q;->i(Ljava/lang/Iterable;)Ljava/lang/Object;

    .line 639
    .line 640
    .line 641
    move-result-object v2

    .line 642
    check-cast v2, LT3/e;

    .line 643
    .line 644
    iget-boolean v2, v2, LT3/e;->m:Z

    .line 645
    .line 646
    if-eqz v2, :cond_1d

    .line 647
    .line 648
    add-int/lit8 v5, v5, -0x1

    .line 649
    .line 650
    :cond_1d
    const-string v2, "_HLS_part"

    .line 651
    .line 652
    invoke-static {v5}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    .line 653
    .line 654
    .line 655
    move-result-object v5

    .line 656
    invoke-virtual {v1, v2, v5}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 657
    .line 658
    .line 659
    :cond_1e
    iget-object v2, v0, LT3/b;->d:LT3/j;

    .line 660
    .line 661
    iget-object v2, v2, LT3/j;->v:LT3/i;

    .line 662
    .line 663
    iget-wide v5, v2, LT3/i;->a:J

    .line 664
    .line 665
    cmp-long v3, v5, v3

    .line 666
    .line 667
    if-eqz v3, :cond_20

    .line 668
    .line 669
    iget-boolean v2, v2, LT3/i;->b:Z

    .line 670
    .line 671
    if-eqz v2, :cond_1f

    .line 672
    .line 673
    const-string v2, "v2"

    .line 674
    .line 675
    goto :goto_11

    .line 676
    :cond_1f
    const-string v2, "YES"

    .line 677
    .line 678
    :goto_11
    const-string v3, "_HLS_skip"

    .line 679
    .line 680
    invoke-virtual {v1, v3, v2}, Landroid/net/Uri$Builder;->appendQueryParameter(Ljava/lang/String;Ljava/lang/String;)Landroid/net/Uri$Builder;

    .line 681
    .line 682
    .line 683
    :cond_20
    invoke-virtual {v1}, Landroid/net/Uri$Builder;->build()Landroid/net/Uri;

    .line 684
    .line 685
    .line 686
    move-result-object v8

    .line 687
    :goto_12
    invoke-virtual {v0, v8}, LT3/b;->c(Landroid/net/Uri;)V

    .line 688
    .line 689
    .line 690
    :cond_21
    return-void
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

.method public final e(Lk4/J;Ljava/io/IOException;I)LB3/f;
    .locals 9

    .line 1
    const/4 v0, 0x1

    .line 2
    const/4 v1, 0x0

    .line 3
    check-cast p1, Lk4/P;

    .line 4
    .line 5
    new-instance v2, LN3/q;

    .line 6
    .line 7
    iget-wide v3, p1, Lk4/P;->a:J

    .line 8
    .line 9
    iget-object v3, p1, Lk4/P;->d:Lk4/V;

    .line 10
    .line 11
    iget-object v3, v3, Lk4/V;->c:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-direct {v2}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    const-string v4, "_HLS_msn"

    .line 17
    .line 18
    invoke-virtual {v3, v4}, Landroid/net/Uri;->getQueryParameter(Ljava/lang/String;)Ljava/lang/String;

    .line 19
    .line 20
    .line 21
    move-result-object v3

    .line 22
    if-eqz v3, :cond_0

    .line 23
    .line 24
    move v3, v0

    .line 25
    goto :goto_0

    .line 26
    :cond_0
    move v3, v1

    .line 27
    :goto_0
    instance-of v4, p2, LT3/o;

    .line 28
    .line 29
    sget-object v5, Lk4/M;->e:LB3/f;

    .line 30
    .line 31
    iget-object v6, p0, LT3/b;->a:Landroid/net/Uri;

    .line 32
    .line 33
    iget-object v7, p0, LT3/b;->k:LT3/c;

    .line 34
    .line 35
    iget p1, p1, Lk4/P;->c:I

    .line 36
    .line 37
    if-nez v3, :cond_1

    .line 38
    .line 39
    if-eqz v4, :cond_3

    .line 40
    .line 41
    :cond_1
    instance-of v3, p2, Lk4/D;

    .line 42
    .line 43
    if-eqz v3, :cond_2

    .line 44
    .line 45
    move-object v3, p2

    .line 46
    check-cast v3, Lk4/D;

    .line 47
    .line 48
    iget v3, v3, Lk4/D;->d:I

    .line 49
    .line 50
    goto :goto_1

    .line 51
    :cond_2
    const v3, 0x7fffffff

    .line 52
    .line 53
    .line 54
    :goto_1
    if-nez v4, :cond_8

    .line 55
    .line 56
    const/16 v4, 0x190

    .line 57
    .line 58
    if-eq v3, v4, :cond_8

    .line 59
    .line 60
    const/16 v4, 0x1f7

    .line 61
    .line 62
    if-ne v3, v4, :cond_3

    .line 63
    .line 64
    goto :goto_4

    .line 65
    :cond_3
    new-instance v3, LA1/i;

    .line 66
    .line 67
    invoke-direct {v3, p3, p2}, LA1/i;-><init>(ILjava/lang/Object;)V

    .line 68
    .line 69
    .line 70
    iget-object p3, v7, LT3/c;->e:Ljava/util/concurrent/CopyOnWriteArrayList;

    .line 71
    .line 72
    invoke-virtual {p3}, Ljava/util/concurrent/CopyOnWriteArrayList;->iterator()Ljava/util/Iterator;

    .line 73
    .line 74
    .line 75
    move-result-object p3

    .line 76
    move v4, v1

    .line 77
    :goto_2
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    .line 78
    .line 79
    .line 80
    move-result v8

    .line 81
    if-eqz v8, :cond_4

    .line 82
    .line 83
    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    .line 84
    .line 85
    .line 86
    move-result-object v8

    .line 87
    check-cast v8, LT3/r;

    .line 88
    .line 89
    invoke-interface {v8, v6, v3, v1}, LT3/r;->d(Landroid/net/Uri;LA1/i;Z)Z

    .line 90
    .line 91
    .line 92
    move-result v8

    .line 93
    xor-int/2addr v8, v0

    .line 94
    or-int/2addr v4, v8

    .line 95
    goto :goto_2

    .line 96
    :cond_4
    iget-object p3, v7, LT3/c;->c:Le1/q;

    .line 97
    .line 98
    if-eqz v4, :cond_6

    .line 99
    .line 100
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 101
    .line 102
    .line 103
    invoke-static {v3}, Le1/q;->h(LA1/i;)J

    .line 104
    .line 105
    .line 106
    move-result-wide v3

    .line 107
    const-wide v5, -0x7fffffffffffffffL    # -4.9E-324

    .line 108
    .line 109
    .line 110
    .line 111
    .line 112
    cmp-long v5, v3, v5

    .line 113
    .line 114
    if-eqz v5, :cond_5

    .line 115
    .line 116
    new-instance v5, LB3/f;

    .line 117
    .line 118
    invoke-direct {v5, v1, v3, v4, v1}, LB3/f;-><init>(IJZ)V

    .line 119
    .line 120
    .line 121
    goto :goto_3

    .line 122
    :cond_5
    sget-object v1, Lk4/M;->f:LB3/f;

    .line 123
    .line 124
    move-object v5, v1

    .line 125
    :cond_6
    :goto_3
    invoke-virtual {v5}, LB3/f;->a()Z

    .line 126
    .line 127
    .line 128
    move-result v1

    .line 129
    xor-int/2addr v0, v1

    .line 130
    iget-object v3, v7, LT3/c;->f:LN3/G;

    .line 131
    .line 132
    invoke-virtual {v3, v2, p1, p2, v0}, LN3/G;->j(LN3/q;ILjava/io/IOException;Z)V

    .line 133
    .line 134
    .line 135
    if-nez v1, :cond_7

    .line 136
    .line 137
    invoke-virtual {p3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 138
    .line 139
    .line 140
    :cond_7
    return-object v5

    .line 141
    :cond_8
    :goto_4
    invoke-static {}, Landroid/os/SystemClock;->elapsedRealtime()J

    .line 142
    .line 143
    .line 144
    move-result-wide v3

    .line 145
    iput-wide v3, p0, LT3/b;->g:J

    .line 146
    .line 147
    invoke-virtual {p0, v6}, LT3/b;->c(Landroid/net/Uri;)V

    .line 148
    .line 149
    .line 150
    iget-object p3, v7, LT3/c;->f:LN3/G;

    .line 151
    .line 152
    sget v1, Ll4/y;->a:I

    .line 153
    .line 154
    invoke-virtual {p3, v2, p1, p2, v0}, LN3/G;->j(LN3/q;ILjava/io/IOException;Z)V

    .line 155
    .line 156
    .line 157
    return-object v5
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
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
    .line 875
    .line 876
    .line 877
    .line 878
    .line 879
    .line 880
    .line 881
    .line 882
    .line 883
    .line 884
    .line 885
    .line 886
    .line 887
    .line 888
    .line 889
    .line 890
    .line 891
    .line 892
    .line 893
    .line 894
    .line 895
    .line 896
    .line 897
    .line 898
    .line 899
    .line 900
    .line 901
    .line 902
    .line 903
    .line 904
    .line 905
    .line 906
    .line 907
    .line 908
    .line 909
    .line 910
    .line 911
    .line 912
    .line 913
    .line 914
    .line 915
    .line 916
    .line 917
    .line 918
    .line 919
    .line 920
    .line 921
    .line 922
    .line 923
    .line 924
    .line 925
    .line 926
    .line 927
    .line 928
    .line 929
    .line 930
    .line 931
    .line 932
    .line 933
    .line 934
    .line 935
    .line 936
    .line 937
    .line 938
    .line 939
    .line 940
    .line 941
    .line 942
    .line 943
    .line 944
    .line 945
    .line 946
    .line 947
    .line 948
    .line 949
    .line 950
    .line 951
    .line 952
    .line 953
    .line 954
    .line 955
    .line 956
    .line 957
    .line 958
    .line 959
    .line 960
    .line 961
    .line 962
    .line 963
    .line 964
    .line 965
    .line 966
    .line 967
    .line 968
    .line 969
    .line 970
    .line 971
    .line 972
    .line 973
    .line 974
    .line 975
    .line 976
    .line 977
    .line 978
    .line 979
    .line 980
    .line 981
    .line 982
    .line 983
    .line 984
    .line 985
    .line 986
    .line 987
    .line 988
    .line 989
    .line 990
    .line 991
    .line 992
    .line 993
.end method

.method public final f(Lk4/J;JJ)V
    .locals 0

    .line 1
    check-cast p1, Lk4/P;

    .line 2
    .line 3
    iget-object p2, p1, Lk4/P;->f:Ljava/lang/Object;

    .line 4
    .line 5
    check-cast p2, LT3/n;

    .line 6
    .line 7
    new-instance p3, LN3/q;

    .line 8
    .line 9
    iget-object p1, p1, Lk4/P;->d:Lk4/V;

    .line 10
    .line 11
    iget-object p1, p1, Lk4/V;->c:Landroid/net/Uri;

    .line 12
    .line 13
    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    .line 14
    .line 15
    .line 16
    instance-of p1, p2, LT3/j;

    .line 17
    .line 18
    const/4 p4, 0x4

    .line 19
    if-eqz p1, :cond_0

    .line 20
    .line 21
    check-cast p2, LT3/j;

    .line 22
    .line 23
    invoke-virtual {p0, p2}, LT3/b;->d(LT3/j;)V

    .line 24
    .line 25
    .line 26
    iget-object p1, p0, LT3/b;->k:LT3/c;

    .line 27
    .line 28
    iget-object p1, p1, LT3/c;->f:LN3/G;

    .line 29
    .line 30
    invoke-virtual {p1, p3, p4}, LN3/G;->f(LN3/q;I)V

    .line 31
    .line 32
    .line 33
    goto :goto_0

    .line 34
    :cond_0
    const-string p1, "Loaded playlist has unexpected type."

    .line 35
    .line 36
    const/4 p2, 0x0

    .line 37
    invoke-static {p1, p2}, Lj3/j0;->b(Ljava/lang/String;Ljava/lang/Exception;)Lj3/j0;

    .line 38
    .line 39
    .line 40
    move-result-object p1

    .line 41
    iput-object p1, p0, LT3/b;->j:Ljava/io/IOException;

    .line 42
    .line 43
    iget-object p2, p0, LT3/b;->k:LT3/c;

    .line 44
    .line 45
    iget-object p2, p2, LT3/c;->f:LN3/G;

    .line 46
    .line 47
    const/4 p5, 0x1

    .line 48
    invoke-virtual {p2, p3, p4, p1, p5}, LN3/G;->j(LN3/q;ILjava/io/IOException;Z)V

    .line 49
    .line 50
    .line 51
    :goto_0
    iget-object p1, p0, LT3/b;->k:LT3/c;

    .line 52
    .line 53
    iget-object p1, p1, LT3/c;->c:Le1/q;

    .line 54
    .line 55
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 56
    .line 57
    .line 58
    return-void
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

.method public final s(Lk4/J;JJZ)V
    .locals 11

    .line 1
    check-cast p1, Lk4/P;

    .line 2
    .line 3
    new-instance v1, LN3/q;

    .line 4
    .line 5
    iget-wide p2, p1, Lk4/P;->a:J

    .line 6
    .line 7
    iget-object p1, p1, Lk4/P;->d:Lk4/V;

    .line 8
    .line 9
    iget-object p1, p1, Lk4/V;->c:Landroid/net/Uri;

    .line 10
    .line 11
    invoke-direct {v1}, Ljava/lang/Object;-><init>()V

    .line 12
    .line 13
    .line 14
    iget-object p1, p0, LT3/b;->k:LT3/c;

    .line 15
    .line 16
    iget-object p2, p1, LT3/c;->c:Le1/q;

    .line 17
    .line 18
    invoke-virtual {p2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object v0, p1, LT3/c;->f:LN3/G;

    .line 22
    .line 23
    const-wide v7, -0x7fffffffffffffffL    # -4.9E-324

    .line 24
    .line 25
    .line 26
    .line 27
    .line 28
    const-wide v9, -0x7fffffffffffffffL    # -4.9E-324

    .line 29
    .line 30
    .line 31
    .line 32
    .line 33
    const/4 v2, 0x4

    .line 34
    const/4 v3, -0x1

    .line 35
    const/4 v4, 0x0

    .line 36
    const/4 v5, 0x0

    .line 37
    const/4 v6, 0x0

    .line 38
    invoke-virtual/range {v0 .. v10}, LN3/G;->d(LN3/q;IILj3/M;ILjava/lang/Object;JJ)V

    .line 39
    .line 40
    .line 41
    return-void
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
    .line 241
    .line 242
    .line 243
    .line 244
    .line 245
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
.end method
