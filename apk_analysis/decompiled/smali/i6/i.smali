.class public final Li6/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final b:Li6/i;

.field public static final c:Li6/i;


# instance fields
.field public final a:Li6/h;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    .line 1
    new-instance v0, Li6/i;

    .line 2
    .line 3
    new-instance v1, Ld0/o;

    .line 4
    .line 5
    const/4 v2, 0x4

    .line 6
    invoke-direct {v1, v2}, Ld0/o;-><init>(I)V

    .line 7
    .line 8
    .line 9
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 10
    .line 11
    .line 12
    sput-object v0, Li6/i;->b:Li6/i;

    .line 13
    .line 14
    new-instance v0, Li6/i;

    .line 15
    .line 16
    new-instance v1, Ld0/w;

    .line 17
    .line 18
    const/4 v2, 0x5

    .line 19
    invoke-direct {v1, v2}, Ld0/w;-><init>(I)V

    .line 20
    .line 21
    .line 22
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 23
    .line 24
    .line 25
    sput-object v0, Li6/i;->c:Li6/i;

    .line 26
    .line 27
    new-instance v0, Li6/i;

    .line 28
    .line 29
    new-instance v1, Ld0/o;

    .line 30
    .line 31
    const/4 v2, 0x6

    .line 32
    invoke-direct {v1, v2}, Ld0/o;-><init>(I)V

    .line 33
    .line 34
    .line 35
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 36
    .line 37
    .line 38
    new-instance v0, Li6/i;

    .line 39
    .line 40
    new-instance v1, Le0/c;

    .line 41
    .line 42
    const/4 v2, 0x5

    .line 43
    invoke-direct {v1, v2}, Le0/c;-><init>(I)V

    .line 44
    .line 45
    .line 46
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 47
    .line 48
    .line 49
    new-instance v0, Li6/i;

    .line 50
    .line 51
    new-instance v1, Ld0/w;

    .line 52
    .line 53
    const/4 v2, 0x4

    .line 54
    invoke-direct {v1, v2}, Ld0/w;-><init>(I)V

    .line 55
    .line 56
    .line 57
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 58
    .line 59
    .line 60
    new-instance v0, Li6/i;

    .line 61
    .line 62
    new-instance v1, Ld0/o;

    .line 63
    .line 64
    const/4 v2, 0x5

    .line 65
    invoke-direct {v1, v2}, Ld0/o;-><init>(I)V

    .line 66
    .line 67
    .line 68
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 69
    .line 70
    .line 71
    new-instance v0, Li6/i;

    .line 72
    .line 73
    new-instance v1, Le0/c;

    .line 74
    .line 75
    const/4 v2, 0x4

    .line 76
    invoke-direct {v1, v2}, Le0/c;-><init>(I)V

    .line 77
    .line 78
    .line 79
    invoke-direct {v0, v1}, Li6/i;-><init>(Li6/j;)V

    .line 80
    .line 81
    .line 82
    return-void
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

.method public constructor <init>(Li6/j;)V
    .locals 2

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    .line 3
    .line 4
    invoke-static {}, LY5/a;->a()Z

    .line 5
    .line 6
    .line 7
    move-result v0

    .line 8
    if-eqz v0, :cond_0

    .line 9
    .line 10
    new-instance v0, Lcom/google/firebase/messaging/u;

    .line 11
    .line 12
    invoke-direct {v0, p1}, Lcom/google/firebase/messaging/u;-><init>(Ljava/lang/Object;)V

    .line 13
    .line 14
    .line 15
    iput-object v0, p0, Li6/i;->a:Li6/h;

    .line 16
    .line 17
    return-void

    .line 18
    :cond_0
    const-string v0, "java.vendor"

    .line 19
    .line 20
    invoke-static {v0}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 21
    .line 22
    .line 23
    move-result-object v0

    .line 24
    const-string v1, "The Android Project"

    .line 25
    .line 26
    invoke-virtual {v1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 27
    .line 28
    .line 29
    move-result v0

    .line 30
    if-eqz v0, :cond_1

    .line 31
    .line 32
    new-instance v0, Li/G;

    .line 33
    .line 34
    const/4 v1, 0x2

    .line 35
    invoke-direct {v0, v1, p1}, Li/G;-><init>(ILjava/lang/Object;)V

    .line 36
    .line 37
    .line 38
    iput-object v0, p0, Li6/i;->a:Li6/h;

    .line 39
    .line 40
    return-void

    .line 41
    :cond_1
    new-instance v0, Lf5/o;

    .line 42
    .line 43
    const/4 v1, 0x4

    .line 44
    invoke-direct {v0, v1, p1}, Lf5/o;-><init>(ILjava/lang/Object;)V

    .line 45
    .line 46
    .line 47
    iput-object v0, p0, Li6/i;->a:Li6/h;

    .line 48
    .line 49
    return-void
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
