.class public final synthetic Ly6/w;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ljava/lang/Runnable;


# instance fields
.field public final synthetic a:Lp/c1;

.field public final synthetic b:LB6/K0;

.field public final synthetic c:LA6/c;

.field public final synthetic d:Z


# direct methods
.method public synthetic constructor <init>(Lp/c1;LB6/K0;LA6/c;Z)V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Ly6/w;->a:Lp/c1;

    iput-object p2, p0, Ly6/w;->b:LB6/K0;

    iput-object p3, p0, Ly6/w;->c:LA6/c;

    iput-boolean p4, p0, Ly6/w;->d:Z

    return-void
.end method


# virtual methods
.method public final run()V
    .locals 4

    .line 1
    iget-object v0, p0, Ly6/w;->a:Lp/c1;

    .line 2
    .line 3
    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    .line 4
    .line 5
    .line 6
    const-string v1, "FirebaseCrashlytics"

    .line 7
    .line 8
    const/4 v2, 0x3

    .line 9
    invoke-static {v1, v2}, Landroid/util/Log;->isLoggable(Ljava/lang/String;I)Z

    .line 10
    .line 11
    .line 12
    move-result v2

    .line 13
    if-eqz v2, :cond_0

    .line 14
    .line 15
    const-string v2, "disk worker: log non-fatal event to persistence"

    .line 16
    .line 17
    const/4 v3, 0x0

    .line 18
    invoke-static {v1, v2, v3}, Landroid/util/Log;->d(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;)I

    .line 19
    .line 20
    .line 21
    :cond_0
    iget-object v1, p0, Ly6/w;->c:LA6/c;

    .line 22
    .line 23
    iget-object v1, v1, LA6/c;->a:Ljava/lang/String;

    .line 24
    .line 25
    iget-object v0, v0, Lp/c1;->b:Ljava/lang/Object;

    .line 26
    .line 27
    check-cast v0, LE6/c;

    .line 28
    .line 29
    iget-object v2, p0, Ly6/w;->b:LB6/K0;

    .line 30
    .line 31
    iget-boolean v3, p0, Ly6/w;->d:Z

    .line 32
    .line 33
    invoke-virtual {v0, v2, v1, v3}, LE6/c;->d(LB6/K0;Ljava/lang/String;Z)V

    .line 34
    .line 35
    .line 36
    return-void
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
