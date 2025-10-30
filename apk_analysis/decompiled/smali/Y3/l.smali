.class public final LY3/l;
.super Lj3/d;
.source "SourceFile"

# interfaces
.implements Landroid/os/Handler$Callback;


# instance fields
.field public A:J

.field public B:J

.field public C:J

.field public final m:Landroid/os/Handler;

.field public final n:Lj3/A;

.field public final o:LY3/j;

.field public final p:LO0/c;

.field public q:Z

.field public r:Z

.field public s:Z

.field public t:I

.field public u:Lj3/M;

.field public v:LY3/h;

.field public w:LY3/k;

.field public x:LY3/d;

.field public y:LY3/d;

.field public z:I


# direct methods
.method public constructor <init>(Lj3/A;Landroid/os/Looper;LY3/j;)V
    .locals 1

    .line 1
    const/4 v0, 0x3

    .line 2
    invoke-direct {p0, v0}, Lj3/d;-><init>(I)V

    .line 3
    .line 4
    .line 5
    iput-object p1, p0, LY3/l;->n:Lj3/A;

    .line 6
    .line 7
    if-nez p2, :cond_0

    .line 8
    .line 9
    const/4 p1, 0x0

    .line 10
    goto :goto_0

    .line 11
    :cond_0
    sget p1, Ll4/y;->a:I

    .line 12
    .line 13
    new-instance p1, Landroid/os/Handler;

    .line 14
    .line 15
    invoke-direct {p1, p2, p0}, Landroid/os/Handler;-><init>(Landroid/os/Looper;Landroid/os/Handler$Callback;)V

    .line 16
    .line 17
    .line 18
    :goto_0
    iput-object p1, p0, LY3/l;->m:Landroid/os/Handler;

    .line 19
    .line 20
    iput-object p3, p0, LY3/l;->o:LY3/j;

    .line 21
    .line 22
    new-instance p1, LO0/c;

    .line 23
    .line 24
    const/16 p2, 0x1c

    .line 25
    .line 26
    const/4 p3, 0x0

    .line 27
    invoke-direct {p1, p2, p3}, LO0/c;-><init>(IZ)V

    .line 28
    .line 29
    .line 30
    iput-object p1, p0, LY3/l;->p:LO0/c;

    .line 31
    .line 32
    const-wide p1, -0x7fffffffffffffffL    # -4.9E-324

    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    iput-wide p1, p0, LY3/l;->A:J

    .line 38
    .line 39
    iput-wide p1, p0, LY3/l;->B:J

    .line 40
    .line 41
    iput-wide p1, p0, LY3/l;->C:J

    .line 42
    .line 43
    return-void
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
.method public final A(LY3/c;)V
    .locals 5

    .line 1
    iget-object v0, p1, LY3/c;->a:LP5/F;

    .line 2
    .line 3
    iget-object v1, p0, LY3/l;->n:Lj3/A;

    .line 4
    .line 5
    iget-object v2, v1, Lj3/A;->a:Lj3/D;

    .line 6
    .line 7
    iget-object v2, v2, Lj3/D;->l:Ll4/l;

    .line 8
    .line 9
    new-instance v3, Lj2/b;

    .line 10
    .line 11
    const/4 v4, 0x3

    .line 12
    invoke-direct {v3, v4, v0}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    const/16 v0, 0x1b

    .line 16
    .line 17
    invoke-virtual {v2, v0, v3}, Ll4/l;->e(ILl4/i;)V

    .line 18
    .line 19
    .line 20
    iget-object v1, v1, Lj3/A;->a:Lj3/D;

    .line 21
    .line 22
    iput-object p1, v1, Lj3/D;->z0:LY3/c;

    .line 23
    .line 24
    new-instance v2, Lj2/b;

    .line 25
    .line 26
    const/4 v3, 0x4

    .line 27
    invoke-direct {v2, v3, p1}, Lj2/b;-><init>(ILjava/lang/Object;)V

    .line 28
    .line 29
    .line 30
    iget-object p1, v1, Lj3/D;->l:Ll4/l;

    .line 31
    .line 32
    invoke-virtual {p1, v0, v2}, Ll4/l;->e(ILl4/i;)V

    .line 33
    .line 34
    .line 35
    return-void
    .line 36
    .line 37
    .line 38
.end method

.method public final B()V
    .locals 2

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LY3/l;->w:LY3/k;

    .line 3
    .line 4
    const/4 v1, -0x1

    .line 5
    iput v1, p0, LY3/l;->z:I

    .line 6
    .line 7
    iget-object v1, p0, LY3/l;->x:LY3/d;

    .line 8
    .line 9
    if-eqz v1, :cond_0

    .line 10
    .line 11
    invoke-virtual {v1}, Lm3/g;->r()V

    .line 12
    .line 13
    .line 14
    iput-object v0, p0, LY3/l;->x:LY3/d;

    .line 15
    .line 16
    :cond_0
    iget-object v1, p0, LY3/l;->y:LY3/d;

    .line 17
    .line 18
    if-eqz v1, :cond_1

    .line 19
    .line 20
    invoke-virtual {v1}, Lm3/g;->r()V

    .line 21
    .line 22
    .line 23
    iput-object v0, p0, LY3/l;->y:LY3/d;

    .line 24
    .line 25
    :cond_1
    return-void
    .line 26
    .line 27
    .line 28
    .line 29
    .line 30
    .line 31
    .line 32
.end method

.method public final g()Ljava/lang/String;
    .locals 1

    .line 1
    const-string v0, "TextRenderer"

    .line 2
    .line 3
    return-object v0
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

.method public final handleMessage(Landroid/os/Message;)Z
    .locals 1

    .line 1
    iget v0, p1, Landroid/os/Message;->what:I

    .line 2
    .line 3
    if-nez v0, :cond_0

    .line 4
    .line 5
    iget-object p1, p1, Landroid/os/Message;->obj:Ljava/lang/Object;

    .line 6
    .line 7
    check-cast p1, LY3/c;

    .line 8
    .line 9
    invoke-virtual {p0, p1}, LY3/l;->A(LY3/c;)V

    .line 10
    .line 11
    .line 12
    const/4 p1, 0x1

    .line 13
    return p1

    .line 14
    :cond_0
    new-instance p1, Ljava/lang/IllegalStateException;

    .line 15
    .line 16
    invoke-direct {p1}, Ljava/lang/IllegalStateException;-><init>()V

    .line 17
    .line 18
    .line 19
    throw p1
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
.end method

.method public final i()Z
    .locals 1

    .line 1
    iget-boolean v0, p0, LY3/l;->r:Z

    .line 2
    .line 3
    return v0
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

.method public final j()Z
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

.method public final k()V
    .locals 7

    .line 1
    const/4 v0, 0x0

    .line 2
    iput-object v0, p0, LY3/l;->u:Lj3/M;

    .line 3
    .line 4
    const-wide v1, -0x7fffffffffffffffL    # -4.9E-324

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    iput-wide v1, p0, LY3/l;->A:J

    .line 10
    .line 11
    new-instance v3, LY3/c;

    .line 12
    .line 13
    sget-object v4, LP5/S;->e:LP5/S;

    .line 14
    .line 15
    iget-wide v5, p0, LY3/l;->C:J

    .line 16
    .line 17
    invoke-virtual {p0, v5, v6}, LY3/l;->z(J)J

    .line 18
    .line 19
    .line 20
    move-result-wide v5

    .line 21
    invoke-direct {v3, v5, v6, v4}, LY3/c;-><init>(JLjava/util/List;)V

    .line 22
    .line 23
    .line 24
    const/4 v4, 0x0

    .line 25
    iget-object v5, p0, LY3/l;->m:Landroid/os/Handler;

    .line 26
    .line 27
    if-eqz v5, :cond_0

    .line 28
    .line 29
    invoke-virtual {v5, v4, v3}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 30
    .line 31
    .line 32
    move-result-object v3

    .line 33
    invoke-virtual {v3}, Landroid/os/Message;->sendToTarget()V

    .line 34
    .line 35
    .line 36
    goto :goto_0

    .line 37
    :cond_0
    invoke-virtual {p0, v3}, LY3/l;->A(LY3/c;)V

    .line 38
    .line 39
    .line 40
    :goto_0
    iput-wide v1, p0, LY3/l;->B:J

    .line 41
    .line 42
    iput-wide v1, p0, LY3/l;->C:J

    .line 43
    .line 44
    invoke-virtual {p0}, LY3/l;->B()V

    .line 45
    .line 46
    .line 47
    iget-object v1, p0, LY3/l;->v:LY3/h;

    .line 48
    .line 49
    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 50
    .line 51
    .line 52
    invoke-interface {v1}, Lm3/c;->a()V

    .line 53
    .line 54
    .line 55
    iput-object v0, p0, LY3/l;->v:LY3/h;

    .line 56
    .line 57
    iput v4, p0, LY3/l;->t:I

    .line 58
    .line 59
    return-void
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

.method public final m(JZ)V
    .locals 2

    .line 1
    iput-wide p1, p0, LY3/l;->C:J

    .line 2
    .line 3
    new-instance p1, LY3/c;

    .line 4
    .line 5
    sget-object p2, LP5/S;->e:LP5/S;

    .line 6
    .line 7
    iget-wide v0, p0, LY3/l;->C:J

    .line 8
    .line 9
    invoke-virtual {p0, v0, v1}, LY3/l;->z(J)J

    .line 10
    .line 11
    .line 12
    move-result-wide v0

    .line 13
    invoke-direct {p1, v0, v1, p2}, LY3/c;-><init>(JLjava/util/List;)V

    .line 14
    .line 15
    .line 16
    const/4 p2, 0x0

    .line 17
    iget-object p3, p0, LY3/l;->m:Landroid/os/Handler;

    .line 18
    .line 19
    if-eqz p3, :cond_0

    .line 20
    .line 21
    invoke-virtual {p3, p2, p1}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 22
    .line 23
    .line 24
    move-result-object p1

    .line 25
    invoke-virtual {p1}, Landroid/os/Message;->sendToTarget()V

    .line 26
    .line 27
    .line 28
    goto :goto_0

    .line 29
    :cond_0
    invoke-virtual {p0, p1}, LY3/l;->A(LY3/c;)V

    .line 30
    .line 31
    .line 32
    :goto_0
    iput-boolean p2, p0, LY3/l;->q:Z

    .line 33
    .line 34
    iput-boolean p2, p0, LY3/l;->r:Z

    .line 35
    .line 36
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 37
    .line 38
    .line 39
    .line 40
    .line 41
    iput-wide v0, p0, LY3/l;->A:J

    .line 42
    .line 43
    iget p1, p0, LY3/l;->t:I

    .line 44
    .line 45
    if-eqz p1, :cond_1

    .line 46
    .line 47
    invoke-virtual {p0}, LY3/l;->B()V

    .line 48
    .line 49
    .line 50
    iget-object p1, p0, LY3/l;->v:LY3/h;

    .line 51
    .line 52
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 53
    .line 54
    .line 55
    invoke-interface {p1}, Lm3/c;->a()V

    .line 56
    .line 57
    .line 58
    const/4 p1, 0x0

    .line 59
    iput-object p1, p0, LY3/l;->v:LY3/h;

    .line 60
    .line 61
    iput p2, p0, LY3/l;->t:I

    .line 62
    .line 63
    const/4 p1, 0x1

    .line 64
    iput-boolean p1, p0, LY3/l;->s:Z

    .line 65
    .line 66
    iget-object p1, p0, LY3/l;->u:Lj3/M;

    .line 67
    .line 68
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 69
    .line 70
    .line 71
    iget-object p2, p0, LY3/l;->o:LY3/j;

    .line 72
    .line 73
    invoke-interface {p2, p1}, LY3/j;->j(Lj3/M;)LY3/h;

    .line 74
    .line 75
    .line 76
    move-result-object p1

    .line 77
    iput-object p1, p0, LY3/l;->v:LY3/h;

    .line 78
    .line 79
    return-void

    .line 80
    :cond_1
    invoke-virtual {p0}, LY3/l;->B()V

    .line 81
    .line 82
    .line 83
    iget-object p1, p0, LY3/l;->v:LY3/h;

    .line 84
    .line 85
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 86
    .line 87
    .line 88
    invoke-interface {p1}, Lm3/c;->flush()V

    .line 89
    .line 90
    .line 91
    return-void
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

.method public final q([Lj3/M;JJ)V
    .locals 0

    .line 1
    iput-wide p4, p0, LY3/l;->B:J

    .line 2
    .line 3
    const/4 p2, 0x0

    .line 4
    aget-object p1, p1, p2

    .line 5
    .line 6
    iput-object p1, p0, LY3/l;->u:Lj3/M;

    .line 7
    .line 8
    iget-object p2, p0, LY3/l;->v:LY3/h;

    .line 9
    .line 10
    const/4 p3, 0x1

    .line 11
    if-eqz p2, :cond_0

    .line 12
    .line 13
    iput p3, p0, LY3/l;->t:I

    .line 14
    .line 15
    return-void

    .line 16
    :cond_0
    iput-boolean p3, p0, LY3/l;->s:Z

    .line 17
    .line 18
    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 19
    .line 20
    .line 21
    iget-object p2, p0, LY3/l;->o:LY3/j;

    .line 22
    .line 23
    invoke-interface {p2, p1}, LY3/j;->j(Lj3/M;)LY3/h;

    .line 24
    .line 25
    .line 26
    move-result-object p1

    .line 27
    iput-object p1, p0, LY3/l;->v:LY3/h;

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

.method public final s(JJ)V
    .locals 19

    .line 1
    move-object/from16 v1, p0

    .line 2
    .line 3
    move-wide/from16 v2, p1

    .line 4
    .line 5
    iget-object v0, v1, LY3/l;->p:LO0/c;

    .line 6
    .line 7
    iput-wide v2, v1, LY3/l;->C:J

    .line 8
    .line 9
    iget-boolean v4, v1, Lj3/d;->k:Z

    .line 10
    .line 11
    const/4 v5, 0x1

    .line 12
    if-eqz v4, :cond_0

    .line 13
    .line 14
    iget-wide v6, v1, LY3/l;->A:J

    .line 15
    .line 16
    const-wide v8, -0x7fffffffffffffffL    # -4.9E-324

    .line 17
    .line 18
    .line 19
    .line 20
    .line 21
    cmp-long v4, v6, v8

    .line 22
    .line 23
    if-eqz v4, :cond_0

    .line 24
    .line 25
    cmp-long v4, v2, v6

    .line 26
    .line 27
    if-ltz v4, :cond_0

    .line 28
    .line 29
    invoke-virtual {v1}, LY3/l;->B()V

    .line 30
    .line 31
    .line 32
    iput-boolean v5, v1, LY3/l;->r:Z

    .line 33
    .line 34
    :cond_0
    iget-boolean v4, v1, LY3/l;->r:Z

    .line 35
    .line 36
    if-eqz v4, :cond_1

    .line 37
    .line 38
    goto/16 :goto_b

    .line 39
    .line 40
    :cond_1
    iget-object v4, v1, LY3/l;->y:LY3/d;

    .line 41
    .line 42
    const-string v6, "TextRenderer"

    .line 43
    .line 44
    const-string v7, "Subtitle decoding failed. streamFormat="

    .line 45
    .line 46
    iget-object v8, v1, LY3/l;->o:LY3/j;

    .line 47
    .line 48
    iget-object v9, v1, LY3/l;->m:Landroid/os/Handler;

    .line 49
    .line 50
    const/4 v10, 0x0

    .line 51
    const/4 v11, 0x0

    .line 52
    if-nez v4, :cond_3

    .line 53
    .line 54
    iget-object v4, v1, LY3/l;->v:LY3/h;

    .line 55
    .line 56
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 57
    .line 58
    .line 59
    invoke-interface {v4, v2, v3}, LY3/h;->c(J)V

    .line 60
    .line 61
    .line 62
    :try_start_0
    iget-object v4, v1, LY3/l;->v:LY3/h;

    .line 63
    .line 64
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 65
    .line 66
    .line 67
    invoke-interface {v4}, Lm3/c;->d()Ljava/lang/Object;

    .line 68
    .line 69
    .line 70
    move-result-object v4

    .line 71
    check-cast v4, LY3/d;

    .line 72
    .line 73
    iput-object v4, v1, LY3/l;->y:LY3/d;
    :try_end_0
    .catch LY3/i; {:try_start_0 .. :try_end_0} :catch_0

    .line 74
    .line 75
    goto :goto_1

    .line 76
    :catch_0
    move-exception v0

    .line 77
    new-instance v2, Ljava/lang/StringBuilder;

    .line 78
    .line 79
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 80
    .line 81
    .line 82
    iget-object v3, v1, LY3/l;->u:Lj3/M;

    .line 83
    .line 84
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 85
    .line 86
    .line 87
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 88
    .line 89
    .line 90
    move-result-object v2

    .line 91
    invoke-static {v6, v2, v0}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 92
    .line 93
    .line 94
    new-instance v0, LY3/c;

    .line 95
    .line 96
    sget-object v2, LP5/S;->e:LP5/S;

    .line 97
    .line 98
    iget-wide v3, v1, LY3/l;->C:J

    .line 99
    .line 100
    invoke-virtual {v1, v3, v4}, LY3/l;->z(J)J

    .line 101
    .line 102
    .line 103
    move-result-wide v3

    .line 104
    invoke-direct {v0, v3, v4, v2}, LY3/c;-><init>(JLjava/util/List;)V

    .line 105
    .line 106
    .line 107
    if-eqz v9, :cond_2

    .line 108
    .line 109
    invoke-virtual {v9, v11, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 110
    .line 111
    .line 112
    move-result-object v0

    .line 113
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 114
    .line 115
    .line 116
    goto :goto_0

    .line 117
    :cond_2
    invoke-virtual {v1, v0}, LY3/l;->A(LY3/c;)V

    .line 118
    .line 119
    .line 120
    :goto_0
    invoke-virtual {v1}, LY3/l;->B()V

    .line 121
    .line 122
    .line 123
    iget-object v0, v1, LY3/l;->v:LY3/h;

    .line 124
    .line 125
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 126
    .line 127
    .line 128
    invoke-interface {v0}, Lm3/c;->a()V

    .line 129
    .line 130
    .line 131
    iput-object v10, v1, LY3/l;->v:LY3/h;

    .line 132
    .line 133
    iput v11, v1, LY3/l;->t:I

    .line 134
    .line 135
    iput-boolean v5, v1, LY3/l;->s:Z

    .line 136
    .line 137
    iget-object v0, v1, LY3/l;->u:Lj3/M;

    .line 138
    .line 139
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 140
    .line 141
    .line 142
    invoke-interface {v8, v0}, LY3/j;->j(Lj3/M;)LY3/h;

    .line 143
    .line 144
    .line 145
    move-result-object v0

    .line 146
    iput-object v0, v1, LY3/l;->v:LY3/h;

    .line 147
    .line 148
    goto/16 :goto_b

    .line 149
    .line 150
    :cond_3
    :goto_1
    iget v4, v1, Lj3/d;->f:I

    .line 151
    .line 152
    const/4 v12, 0x2

    .line 153
    if-eq v4, v12, :cond_4

    .line 154
    .line 155
    goto/16 :goto_b

    .line 156
    .line 157
    :cond_4
    iget-object v4, v1, LY3/l;->x:LY3/d;

    .line 158
    .line 159
    if-eqz v4, :cond_5

    .line 160
    .line 161
    invoke-virtual {v1}, LY3/l;->y()J

    .line 162
    .line 163
    .line 164
    move-result-wide v13

    .line 165
    move v4, v11

    .line 166
    :goto_2
    cmp-long v13, v13, v2

    .line 167
    .line 168
    if-gtz v13, :cond_6

    .line 169
    .line 170
    iget v4, v1, LY3/l;->z:I

    .line 171
    .line 172
    add-int/2addr v4, v5

    .line 173
    iput v4, v1, LY3/l;->z:I

    .line 174
    .line 175
    invoke-virtual {v1}, LY3/l;->y()J

    .line 176
    .line 177
    .line 178
    move-result-wide v13

    .line 179
    move v4, v5

    .line 180
    goto :goto_2

    .line 181
    :cond_5
    move v4, v11

    .line 182
    :cond_6
    iget-object v13, v1, LY3/l;->y:LY3/d;

    .line 183
    .line 184
    const/4 v14, 0x4

    .line 185
    if-eqz v13, :cond_a

    .line 186
    .line 187
    invoke-virtual {v13, v14}, LQ0/b;->e(I)Z

    .line 188
    .line 189
    .line 190
    move-result v15

    .line 191
    if-eqz v15, :cond_8

    .line 192
    .line 193
    if-nez v4, :cond_a

    .line 194
    .line 195
    invoke-virtual {v1}, LY3/l;->y()J

    .line 196
    .line 197
    .line 198
    move-result-wide v15

    .line 199
    const-wide v17, 0x7fffffffffffffffL

    .line 200
    .line 201
    .line 202
    .line 203
    .line 204
    cmp-long v13, v15, v17

    .line 205
    .line 206
    if-nez v13, :cond_a

    .line 207
    .line 208
    iget v13, v1, LY3/l;->t:I

    .line 209
    .line 210
    if-ne v13, v12, :cond_7

    .line 211
    .line 212
    invoke-virtual {v1}, LY3/l;->B()V

    .line 213
    .line 214
    .line 215
    iget-object v13, v1, LY3/l;->v:LY3/h;

    .line 216
    .line 217
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 218
    .line 219
    .line 220
    invoke-interface {v13}, Lm3/c;->a()V

    .line 221
    .line 222
    .line 223
    iput-object v10, v1, LY3/l;->v:LY3/h;

    .line 224
    .line 225
    iput v11, v1, LY3/l;->t:I

    .line 226
    .line 227
    iput-boolean v5, v1, LY3/l;->s:Z

    .line 228
    .line 229
    iget-object v13, v1, LY3/l;->u:Lj3/M;

    .line 230
    .line 231
    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 232
    .line 233
    .line 234
    invoke-interface {v8, v13}, LY3/j;->j(Lj3/M;)LY3/h;

    .line 235
    .line 236
    .line 237
    move-result-object v13

    .line 238
    iput-object v13, v1, LY3/l;->v:LY3/h;

    .line 239
    .line 240
    goto :goto_3

    .line 241
    :cond_7
    invoke-virtual {v1}, LY3/l;->B()V

    .line 242
    .line 243
    .line 244
    iput-boolean v5, v1, LY3/l;->r:Z

    .line 245
    .line 246
    goto :goto_3

    .line 247
    :cond_8
    iget-wide v14, v13, Lm3/g;->c:J

    .line 248
    .line 249
    cmp-long v14, v14, v2

    .line 250
    .line 251
    if-gtz v14, :cond_a

    .line 252
    .line 253
    iget-object v4, v1, LY3/l;->x:LY3/d;

    .line 254
    .line 255
    if-eqz v4, :cond_9

    .line 256
    .line 257
    invoke-virtual {v4}, Lm3/g;->r()V

    .line 258
    .line 259
    .line 260
    :cond_9
    invoke-virtual {v13, v2, v3}, LY3/d;->a(J)I

    .line 261
    .line 262
    .line 263
    move-result v4

    .line 264
    iput v4, v1, LY3/l;->z:I

    .line 265
    .line 266
    iput-object v13, v1, LY3/l;->x:LY3/d;

    .line 267
    .line 268
    iput-object v10, v1, LY3/l;->y:LY3/d;

    .line 269
    .line 270
    move v4, v5

    .line 271
    :cond_a
    :goto_3
    if-eqz v4, :cond_e

    .line 272
    .line 273
    iget-object v4, v1, LY3/l;->x:LY3/d;

    .line 274
    .line 275
    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 276
    .line 277
    .line 278
    iget-object v4, v1, LY3/l;->x:LY3/d;

    .line 279
    .line 280
    invoke-virtual {v4, v2, v3}, LY3/d;->a(J)I

    .line 281
    .line 282
    .line 283
    move-result v4

    .line 284
    if-nez v4, :cond_b

    .line 285
    .line 286
    iget-object v4, v1, LY3/l;->x:LY3/d;

    .line 287
    .line 288
    iget-wide v13, v4, Lm3/g;->c:J

    .line 289
    .line 290
    goto :goto_4

    .line 291
    :cond_b
    const/4 v13, -0x1

    .line 292
    if-ne v4, v13, :cond_c

    .line 293
    .line 294
    iget-object v4, v1, LY3/l;->x:LY3/d;

    .line 295
    .line 296
    invoke-virtual {v4}, LY3/d;->J()I

    .line 297
    .line 298
    .line 299
    move-result v13

    .line 300
    sub-int/2addr v13, v5

    .line 301
    invoke-virtual {v4, v13}, LY3/d;->m(I)J

    .line 302
    .line 303
    .line 304
    move-result-wide v13

    .line 305
    goto :goto_4

    .line 306
    :cond_c
    iget-object v13, v1, LY3/l;->x:LY3/d;

    .line 307
    .line 308
    sub-int/2addr v4, v5

    .line 309
    invoke-virtual {v13, v4}, LY3/d;->m(I)J

    .line 310
    .line 311
    .line 312
    move-result-wide v13

    .line 313
    :goto_4
    invoke-virtual {v1, v13, v14}, LY3/l;->z(J)J

    .line 314
    .line 315
    .line 316
    move-result-wide v13

    .line 317
    new-instance v4, LY3/c;

    .line 318
    .line 319
    iget-object v15, v1, LY3/l;->x:LY3/d;

    .line 320
    .line 321
    invoke-virtual {v15, v2, v3}, LY3/d;->w(J)Ljava/util/List;

    .line 322
    .line 323
    .line 324
    move-result-object v2

    .line 325
    invoke-direct {v4, v13, v14, v2}, LY3/c;-><init>(JLjava/util/List;)V

    .line 326
    .line 327
    .line 328
    if-eqz v9, :cond_d

    .line 329
    .line 330
    invoke-virtual {v9, v11, v4}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 331
    .line 332
    .line 333
    move-result-object v2

    .line 334
    invoke-virtual {v2}, Landroid/os/Message;->sendToTarget()V

    .line 335
    .line 336
    .line 337
    goto :goto_5

    .line 338
    :cond_d
    invoke-virtual {v1, v4}, LY3/l;->A(LY3/c;)V

    .line 339
    .line 340
    .line 341
    :cond_e
    :goto_5
    iget v2, v1, LY3/l;->t:I

    .line 342
    .line 343
    if-ne v2, v12, :cond_f

    .line 344
    .line 345
    goto/16 :goto_b

    .line 346
    .line 347
    :cond_f
    :goto_6
    :try_start_1
    iget-boolean v2, v1, LY3/l;->q:Z

    .line 348
    .line 349
    if-nez v2, :cond_17

    .line 350
    .line 351
    iget-object v2, v1, LY3/l;->w:LY3/k;

    .line 352
    .line 353
    if-nez v2, :cond_11

    .line 354
    .line 355
    iget-object v2, v1, LY3/l;->v:LY3/h;

    .line 356
    .line 357
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 358
    .line 359
    .line 360
    invoke-interface {v2}, Lm3/c;->e()Ljava/lang/Object;

    .line 361
    .line 362
    .line 363
    move-result-object v2

    .line 364
    check-cast v2, LY3/k;

    .line 365
    .line 366
    if-nez v2, :cond_10

    .line 367
    .line 368
    goto/16 :goto_b

    .line 369
    .line 370
    :cond_10
    iput-object v2, v1, LY3/l;->w:LY3/k;

    .line 371
    .line 372
    goto :goto_7

    .line 373
    :catch_1
    move-exception v0

    .line 374
    goto :goto_9

    .line 375
    :cond_11
    :goto_7
    iget v3, v1, LY3/l;->t:I

    .line 376
    .line 377
    if-ne v3, v5, :cond_12

    .line 378
    .line 379
    const/4 v3, 0x4

    .line 380
    iput v3, v2, LQ0/b;->b:I

    .line 381
    .line 382
    iget-object v0, v1, LY3/l;->v:LY3/h;

    .line 383
    .line 384
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 385
    .line 386
    .line 387
    invoke-interface {v0, v2}, Lm3/c;->b(LY3/k;)V

    .line 388
    .line 389
    .line 390
    iput-object v10, v1, LY3/l;->w:LY3/k;

    .line 391
    .line 392
    iput v12, v1, LY3/l;->t:I

    .line 393
    .line 394
    return-void

    .line 395
    :cond_12
    invoke-virtual {v1, v0, v2, v11}, Lj3/d;->r(LO0/c;Lm3/f;I)I

    .line 396
    .line 397
    .line 398
    move-result v3

    .line 399
    const/4 v4, -0x4

    .line 400
    if-ne v3, v4, :cond_15

    .line 401
    .line 402
    const/4 v4, 0x4

    .line 403
    invoke-virtual {v2, v4}, LQ0/b;->e(I)Z

    .line 404
    .line 405
    .line 406
    move-result v3

    .line 407
    if-eqz v3, :cond_13

    .line 408
    .line 409
    iput-boolean v5, v1, LY3/l;->q:Z

    .line 410
    .line 411
    iput-boolean v11, v1, LY3/l;->s:Z

    .line 412
    .line 413
    goto :goto_8

    .line 414
    :cond_13
    iget-object v3, v0, LO0/c;->c:Ljava/lang/Object;

    .line 415
    .line 416
    check-cast v3, Lj3/M;

    .line 417
    .line 418
    if-nez v3, :cond_14

    .line 419
    .line 420
    goto :goto_b

    .line 421
    :cond_14
    iget-wide v13, v3, Lj3/M;->p:J

    .line 422
    .line 423
    iput-wide v13, v2, LY3/k;->i:J

    .line 424
    .line 425
    invoke-virtual {v2}, Lm3/f;->u()V

    .line 426
    .line 427
    .line 428
    iget-boolean v3, v1, LY3/l;->s:Z

    .line 429
    .line 430
    invoke-virtual {v2, v5}, LQ0/b;->e(I)Z

    .line 431
    .line 432
    .line 433
    move-result v13

    .line 434
    xor-int/2addr v13, v5

    .line 435
    and-int/2addr v3, v13

    .line 436
    iput-boolean v3, v1, LY3/l;->s:Z

    .line 437
    .line 438
    :goto_8
    iget-boolean v3, v1, LY3/l;->s:Z

    .line 439
    .line 440
    if-nez v3, :cond_f

    .line 441
    .line 442
    iget-object v3, v1, LY3/l;->v:LY3/h;

    .line 443
    .line 444
    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 445
    .line 446
    .line 447
    invoke-interface {v3, v2}, Lm3/c;->b(LY3/k;)V

    .line 448
    .line 449
    .line 450
    iput-object v10, v1, LY3/l;->w:LY3/k;
    :try_end_1
    .catch LY3/i; {:try_start_1 .. :try_end_1} :catch_1

    .line 451
    .line 452
    goto :goto_6

    .line 453
    :cond_15
    const/4 v4, 0x4

    .line 454
    const/4 v2, -0x3

    .line 455
    if-ne v3, v2, :cond_f

    .line 456
    .line 457
    goto :goto_b

    .line 458
    :goto_9
    new-instance v2, Ljava/lang/StringBuilder;

    .line 459
    .line 460
    invoke-direct {v2, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    .line 461
    .line 462
    .line 463
    iget-object v3, v1, LY3/l;->u:Lj3/M;

    .line 464
    .line 465
    invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    .line 466
    .line 467
    .line 468
    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    .line 469
    .line 470
    .line 471
    move-result-object v2

    .line 472
    invoke-static {v6, v2, v0}, Ll4/a;->u(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)V

    .line 473
    .line 474
    .line 475
    new-instance v0, LY3/c;

    .line 476
    .line 477
    sget-object v2, LP5/S;->e:LP5/S;

    .line 478
    .line 479
    iget-wide v3, v1, LY3/l;->C:J

    .line 480
    .line 481
    invoke-virtual {v1, v3, v4}, LY3/l;->z(J)J

    .line 482
    .line 483
    .line 484
    move-result-wide v3

    .line 485
    invoke-direct {v0, v3, v4, v2}, LY3/c;-><init>(JLjava/util/List;)V

    .line 486
    .line 487
    .line 488
    if-eqz v9, :cond_16

    .line 489
    .line 490
    invoke-virtual {v9, v11, v0}, Landroid/os/Handler;->obtainMessage(ILjava/lang/Object;)Landroid/os/Message;

    .line 491
    .line 492
    .line 493
    move-result-object v0

    .line 494
    invoke-virtual {v0}, Landroid/os/Message;->sendToTarget()V

    .line 495
    .line 496
    .line 497
    goto :goto_a

    .line 498
    :cond_16
    invoke-virtual {v1, v0}, LY3/l;->A(LY3/c;)V

    .line 499
    .line 500
    .line 501
    :goto_a
    invoke-virtual {v1}, LY3/l;->B()V

    .line 502
    .line 503
    .line 504
    iget-object v0, v1, LY3/l;->v:LY3/h;

    .line 505
    .line 506
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 507
    .line 508
    .line 509
    invoke-interface {v0}, Lm3/c;->a()V

    .line 510
    .line 511
    .line 512
    iput-object v10, v1, LY3/l;->v:LY3/h;

    .line 513
    .line 514
    iput v11, v1, LY3/l;->t:I

    .line 515
    .line 516
    iput-boolean v5, v1, LY3/l;->s:Z

    .line 517
    .line 518
    iget-object v0, v1, LY3/l;->u:Lj3/M;

    .line 519
    .line 520
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 521
    .line 522
    .line 523
    invoke-interface {v8, v0}, LY3/j;->j(Lj3/M;)LY3/h;

    .line 524
    .line 525
    .line 526
    move-result-object v0

    .line 527
    iput-object v0, v1, LY3/l;->v:LY3/h;

    .line 528
    .line 529
    :cond_17
    :goto_b
    return-void
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
.end method

.method public final w(Lj3/M;)I
    .locals 2

    .line 1
    iget-object v0, p0, LY3/l;->o:LY3/j;

    .line 2
    .line 3
    invoke-interface {v0, p1}, LY3/j;->k(Lj3/M;)Z

    .line 4
    .line 5
    .line 6
    move-result v0

    .line 7
    const/4 v1, 0x0

    .line 8
    if-eqz v0, :cond_1

    .line 9
    .line 10
    iget p1, p1, Lj3/M;->X:I

    .line 11
    .line 12
    if-nez p1, :cond_0

    .line 13
    .line 14
    const/4 p1, 0x4

    .line 15
    goto :goto_0

    .line 16
    :cond_0
    const/4 p1, 0x2

    .line 17
    :goto_0
    invoke-static {p1, v1, v1}, Lcom/google/android/gms/internal/measurement/k1;->e(III)I

    .line 18
    .line 19
    .line 20
    move-result p1

    .line 21
    return p1

    .line 22
    :cond_1
    iget-object p1, p1, Lj3/M;->l:Ljava/lang/String;

    .line 23
    .line 24
    invoke-static {p1}, Ll4/n;->k(Ljava/lang/String;)Z

    .line 25
    .line 26
    .line 27
    move-result p1

    .line 28
    if-eqz p1, :cond_2

    .line 29
    .line 30
    const/4 p1, 0x1

    .line 31
    invoke-static {p1, v1, v1}, Lcom/google/android/gms/internal/measurement/k1;->e(III)I

    .line 32
    .line 33
    .line 34
    move-result p1

    .line 35
    return p1

    .line 36
    :cond_2
    invoke-static {v1, v1, v1}, Lcom/google/android/gms/internal/measurement/k1;->e(III)I

    .line 37
    .line 38
    .line 39
    move-result p1

    .line 40
    return p1
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
.end method

.method public final y()J
    .locals 4

    .line 1
    iget v0, p0, LY3/l;->z:I

    .line 2
    .line 3
    const/4 v1, -0x1

    .line 4
    const-wide v2, 0x7fffffffffffffffL

    .line 5
    .line 6
    .line 7
    .line 8
    .line 9
    if-ne v0, v1, :cond_0

    .line 10
    .line 11
    return-wide v2

    .line 12
    :cond_0
    iget-object v0, p0, LY3/l;->x:LY3/d;

    .line 13
    .line 14
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 15
    .line 16
    .line 17
    iget v0, p0, LY3/l;->z:I

    .line 18
    .line 19
    iget-object v1, p0, LY3/l;->x:LY3/d;

    .line 20
    .line 21
    invoke-virtual {v1}, LY3/d;->J()I

    .line 22
    .line 23
    .line 24
    move-result v1

    .line 25
    if-lt v0, v1, :cond_1

    .line 26
    .line 27
    return-wide v2

    .line 28
    :cond_1
    iget-object v0, p0, LY3/l;->x:LY3/d;

    .line 29
    .line 30
    iget v1, p0, LY3/l;->z:I

    .line 31
    .line 32
    invoke-virtual {v0, v1}, LY3/d;->m(I)J

    .line 33
    .line 34
    .line 35
    move-result-wide v0

    .line 36
    return-wide v0
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
.end method

.method public final z(J)J
    .locals 7

    .line 1
    const-wide v0, -0x7fffffffffffffffL    # -4.9E-324

    .line 2
    .line 3
    .line 4
    .line 5
    .line 6
    cmp-long v2, p1, v0

    .line 7
    .line 8
    const/4 v3, 0x0

    .line 9
    const/4 v4, 0x1

    .line 10
    if-eqz v2, :cond_0

    .line 11
    .line 12
    move v2, v4

    .line 13
    goto :goto_0

    .line 14
    :cond_0
    move v2, v3

    .line 15
    :goto_0
    invoke-static {v2}, Ll4/a;->m(Z)V

    .line 16
    .line 17
    .line 18
    iget-wide v5, p0, LY3/l;->B:J

    .line 19
    .line 20
    cmp-long v0, v5, v0

    .line 21
    .line 22
    if-eqz v0, :cond_1

    .line 23
    .line 24
    move v3, v4

    .line 25
    :cond_1
    invoke-static {v3}, Ll4/a;->m(Z)V

    .line 26
    .line 27
    .line 28
    iget-wide v0, p0, LY3/l;->B:J

    .line 29
    .line 30
    sub-long/2addr p1, v0

    .line 31
    return-wide p1
    .line 32
    .line 33
    .line 34
    .line 35
    .line 36
    .line 37
    .line 38
.end method
