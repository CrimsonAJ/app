.class public interface abstract Lco/notix/Notix;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lco/notix/Notix$Companion;
    }
.end annotation


# static fields
.field public static final Companion:Lco/notix/Notix$Companion;


# direct methods
.method public static constructor <clinit>()V
    .locals 1

    sget-object v0, Lco/notix/Notix$Companion;->$$INSTANCE:Lco/notix/Notix$Companion;

    sput-object v0, Lco/notix/Notix;->Companion:Lco/notix/Notix$Companion;

    return-void
.end method


# virtual methods
.method public abstract getVersion()Ljava/lang/String;
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract setCallbackHandler(Lco/notix/callback/NotixCallbackHandler;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract setLogLevel(Lco/notix/log/LogLevel;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method

.method public abstract setUserAgent(Ljava/lang/String;)V
    .annotation build Landroidx/annotation/Keep;
    .end annotation
.end method
