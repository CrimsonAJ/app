.class public abstract Lz8/J;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:LF0/e;

.field public static final b:Lz8/a;

.field public static final c:Lz8/a;


# direct methods
.method static constructor <clinit>()V
    .locals 5

    .line 1
    const/4 v0, 0x7

    .line 2
    const/4 v1, 0x6

    .line 3
    const-string v2, "java.vm.name"

    .line 4
    .line 5
    invoke-static {v2}, Ljava/lang/System;->getProperty(Ljava/lang/String;)Ljava/lang/String;

    .line 6
    .line 7
    .line 8
    move-result-object v2

    .line 9
    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 10
    .line 11
    .line 12
    const/4 v3, 0x0

    .line 13
    const-string v4, "RoboVM"

    .line 14
    .line 15
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 16
    .line 17
    .line 18
    move-result v4

    .line 19
    if-nez v4, :cond_2

    .line 20
    .line 21
    const-string v4, "Dalvik"

    .line 22
    .line 23
    invoke-virtual {v2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z

    .line 24
    .line 25
    .line 26
    move-result v2

    .line 27
    if-nez v2, :cond_0

    .line 28
    .line 29
    sput-object v3, Lz8/J;->a:LF0/e;

    .line 30
    .line 31
    new-instance v0, Lz8/K;

    .line 32
    .line 33
    const/4 v2, 0x1

    .line 34
    invoke-direct {v0, v2}, Lz8/K;-><init>(I)V

    .line 35
    .line 36
    .line 37
    sput-object v0, Lz8/J;->b:Lz8/a;

    .line 38
    .line 39
    new-instance v0, Lz8/c;

    .line 40
    .line 41
    invoke-direct {v0, v1}, Lz8/a;-><init>(I)V

    .line 42
    .line 43
    .line 44
    sput-object v0, Lz8/J;->c:Lz8/a;

    .line 45
    .line 46
    return-void

    .line 47
    :cond_0
    new-instance v2, LF0/e;

    .line 48
    .line 49
    const/4 v3, 0x3

    .line 50
    invoke-direct {v2, v3}, LF0/e;-><init>(I)V

    .line 51
    .line 52
    .line 53
    sput-object v2, Lz8/J;->a:LF0/e;

    .line 54
    .line 55
    sget v2, Landroid/os/Build$VERSION;->SDK_INT:I

    .line 56
    .line 57
    const/16 v3, 0x18

    .line 58
    .line 59
    if-lt v2, v3, :cond_1

    .line 60
    .line 61
    new-instance v0, Lz8/K;

    .line 62
    .line 63
    const/4 v2, 0x0

    .line 64
    invoke-direct {v0, v2}, Lz8/K;-><init>(I)V

    .line 65
    .line 66
    .line 67
    sput-object v0, Lz8/J;->b:Lz8/a;

    .line 68
    .line 69
    new-instance v0, Lz8/c;

    .line 70
    .line 71
    invoke-direct {v0, v1}, Lz8/a;-><init>(I)V

    .line 72
    .line 73
    .line 74
    sput-object v0, Lz8/J;->c:Lz8/a;

    .line 75
    .line 76
    return-void

    .line 77
    :cond_1
    new-instance v2, Lz8/a;

    .line 78
    .line 79
    invoke-direct {v2, v0}, Lz8/a;-><init>(I)V

    .line 80
    .line 81
    .line 82
    sput-object v2, Lz8/J;->b:Lz8/a;

    .line 83
    .line 84
    new-instance v0, Lz8/a;

    .line 85
    .line 86
    invoke-direct {v0, v1}, Lz8/a;-><init>(I)V

    .line 87
    .line 88
    .line 89
    sput-object v0, Lz8/J;->c:Lz8/a;

    .line 90
    .line 91
    return-void

    .line 92
    :cond_2
    sput-object v3, Lz8/J;->a:LF0/e;

    .line 93
    .line 94
    new-instance v2, Lz8/a;

    .line 95
    .line 96
    invoke-direct {v2, v0}, Lz8/a;-><init>(I)V

    .line 97
    .line 98
    .line 99
    sput-object v2, Lz8/J;->b:Lz8/a;

    .line 100
    .line 101
    new-instance v0, Lz8/a;

    .line 102
    .line 103
    invoke-direct {v0, v1}, Lz8/a;-><init>(I)V

    .line 104
    .line 105
    .line 106
    sput-object v0, Lz8/J;->c:Lz8/a;

    .line 107
    .line 108
    return-void
.end method
